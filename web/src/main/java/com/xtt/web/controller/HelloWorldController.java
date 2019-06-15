package com.xtt.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorld
 *
 * @Author xuett
 * @Date 2019/6/15 16:56
 */
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {

        return "Hello,World ! 五狗";
    }
}
