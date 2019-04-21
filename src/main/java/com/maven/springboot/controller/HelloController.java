package com.maven.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/4/13.
 */
@RestController
public class HelloController {

    @RequestMapping("/info")
    public String info(){
        return "dep";
    }

}
