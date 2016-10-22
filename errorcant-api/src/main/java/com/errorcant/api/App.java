package com.errorcant.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by yel on 10/20/16.
 */
@SpringBootApplication(scanBasePackages = {"com.errorcant"})
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
