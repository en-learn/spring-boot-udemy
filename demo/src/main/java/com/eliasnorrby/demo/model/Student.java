package com.eliasnorrby.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Student {
  @JsonProperty("id")
  @Setter
  private UUID id;
  @JsonProperty("age")
  private final Integer age;
  @JsonProperty("firstName")
  private final String firstName;
  @JsonProperty("lastName")
  private final String lastName;
  @JsonProperty("course")
  private final String course;
}
