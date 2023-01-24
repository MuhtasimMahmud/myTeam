package com.project.myTeam.controller.authority;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authority")
public class authority {

    @GetMapping("/authorityHome")
    public String league11(){
        return "authority/authorityHome";
    }


    @GetMapping("/playersName")
    public String players(){
        return "authority/playersName";
    }

    @GetMapping("/teamsName")
    public String teams(){
        return "authority/teamsName";
    }

}
