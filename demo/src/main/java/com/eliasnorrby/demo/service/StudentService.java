package com.eliasnorrby.demo.service;

import com.eliasnorrby.demo.dao.StudentDao;
import com.eliasnorrby.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.UUID;

public class StudentService {

  private final StudentDao studentDao;

  @Autowired
  public StudentService(@Qualifier("fakeDao") StudentDao studentDao) {
    this.studentDao = studentDao;
  }

  public int persistNewStudent(UUID studentId, Student student) {
    UUID studentUid = studentId == null ? UUID.randomUUID() : studentId;
    return studentDao.insertNewStudent(studentUid, student);
  }

  public Student getStudentById(UUID studentId) {
    return studentDao.selectStudentById(studentId);
  }

  public List<Student> getAllStudents() {
    return studentDao.selectAllStudents();
  }

  public int updateStudentById(UUID studentId, Student studentUpdate) {

    return studentDao.updateStudentById(studentId, studentUpdate);
  }

  public int deleteStudentById(UUID studentId) {
    return studentDao.deleteStudentById(studentId);
  }
}
