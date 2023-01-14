package com.docker.springDocker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {
    @GetMapping("/")
    public String greeting (){
        return "Greeting From Spring Docker";
    }
}
