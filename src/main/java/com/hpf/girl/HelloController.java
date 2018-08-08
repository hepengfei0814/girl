package com.hpf.girl;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public String say(){
        return "Hello Springboot Controller";
    }
}
