package com.project.myTeam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {


    @GetMapping("/user")
    public String normalUser(){
        return "player/playerDashboard";
    }

    @GetMapping("/admin")
    public String adminUser(){
        return "teamOwner/ownerDashboard";
    }

}
