/**
 * Project Name:springbootJSPTest
 * File Name:HelloWorld.java
 * Package Name:com.example.demo.controller
 * Date:2019年1月6日下午7:42:17
 * Copyright (c) 2019, bluemobi All Rights Reserved.
 *
*/

package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String helloWorld() {
        return "success";
    }
}
