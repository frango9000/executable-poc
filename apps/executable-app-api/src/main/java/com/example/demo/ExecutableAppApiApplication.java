package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExecutableAppApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(ExecutableAppApiApplication.class, args);

    try {
      Browser.openUrl("http://localhost:8080/app/index.html");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
