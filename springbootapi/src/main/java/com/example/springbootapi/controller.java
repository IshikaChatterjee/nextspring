package com.example.springbootapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {
    @RequestMapping("/") public String helloworld()
    {
        return "hello world";
    }
  

}
