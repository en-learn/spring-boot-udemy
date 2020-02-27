package com.eliasnorrby.demo.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Student {
  private final UUID id;
  private final Integer age;
  private final String firstName;
  private final String lastName;
  private final String course;
}
