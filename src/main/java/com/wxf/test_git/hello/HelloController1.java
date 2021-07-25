package com.wxf.test_git.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController1 {
    @RequestMapping("hello1")
    public String hello1(){
        return "hello1";
    }
}
