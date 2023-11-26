package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class Controller {
  @GetMapping("/hello")
  public Map<String, Object> get() {
    Map<String, Object> result = new HashMap<>();
    result.put("message", "Hello, World!");
    result.put("time", new Date());
    return result;
  }
}
