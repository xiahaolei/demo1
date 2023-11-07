package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiahl
 * @date 2023/11/07 10:11
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test1")
    public void test() {
        System.out.println("-------------------111---------------------");
    }

}
