package com.docker.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * MainController
 */
@Controller
public class MainController {

  @GetMapping("/welcome")
  public String Welcome() {
    return "welcome";
  }
}
