package com.app.banking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainPage {


    @RequestMapping("/v2")
    public String string(){
        return "HELLO SALEH!";
    }
}
