package com.example.stopmadspild;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MadController {
    @GetMapping("/")
    public String front(){
        return "front";
    }

    @GetMapping("/forbruger")
    public String menu1(){
        return "menu1";
    }

    @GetMapping("/virksomhed")
    public String menu2(){
        return "menu2";
    }

    @GetMapping("/omOs")
    public String menu3(){
        return "menu3";
    }
}
