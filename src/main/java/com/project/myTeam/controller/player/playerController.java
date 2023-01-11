package com.project.myTeam.controller.player;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/player")
public class playerController {



    @GetMapping("/playerDashboard")
    public String normalUser(){
        return "player/playerDashboard";
    }

}
