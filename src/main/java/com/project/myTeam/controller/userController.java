package com.project.myTeam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {


    @GetMapping("/playerDashboard")
    public String normalUser(){
        return "player/playerDashboard";
    }

    @GetMapping("/managerDashboard")
    public String adminUser(){
        return "teamManagement/managerDashboard";
    }

}
