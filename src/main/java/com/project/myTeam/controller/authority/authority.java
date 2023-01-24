package com.project.myTeam.controller.authority;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authority")
public class authority {

    @GetMapping("/league11Authority")
    public String league11(){
        return "authority/authorityBase";
    }
}
