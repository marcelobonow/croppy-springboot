package com.marcelo.croppy.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "account")
public class Account {
  @Id
  private int id;
  private String name;
  private String email;
  private String password;
}