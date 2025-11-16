package com.marcelo.croppy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.marcelo.croppy")
public class CroppyApplication {

  public static void main(String[] args) {
    SpringApplication.run(CroppyApplication.class, args);
  }

}
