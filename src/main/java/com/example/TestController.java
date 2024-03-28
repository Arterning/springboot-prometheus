package com.example;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Thread.sleep;

@RestController()
public class TestController {


  @GetMapping("test")
  public String test() {
    return "test";
  }


  @Timed(value = "TestController.myMethod", description = "Time taken to execute My Method")
  @GetMapping("/myMethod")
  public String myMethod() {
    // Your method logic here
    try {
      sleep(2333);
    } catch (Exception e) {
      //
    }
    return "Hello from My Method!";
  }


}
