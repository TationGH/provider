package com.example.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author by Zts
 * @Date 2021/4/25 20:10
 * @Classname HelloController
 * @Description
 **/
@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping("/getMessage")
    public String getMessage() {
        return "Hello World! —— By Provider！";
    }
}
