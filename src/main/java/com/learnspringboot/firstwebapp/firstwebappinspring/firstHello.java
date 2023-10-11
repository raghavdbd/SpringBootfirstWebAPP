package com.learnspringboot.firstwebapp.firstwebappinspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstHello {
      @RequestMapping("say-hello")

    public String sayHello(){
        return "HellowWorld";
    }
    
}
