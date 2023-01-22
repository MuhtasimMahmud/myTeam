package com.project.myTeam.controller.player;

import com.project.myTeam.models.User;
import com.project.myTeam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/player")
public class playerController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/playerHome")
    public String playerUser(){
        return "player/playerHome";
    }


    @GetMapping("/best11")
    public String best11(){
        return "player/best11";
    }

    @GetMapping("/allPlayers")
    public String allPlayers(){
        return "player/allPlayers";
    }


    @GetMapping("/availability")
    public String application(){
        return "player/availability";
    }



    @GetMapping("/playerProfile")
    public String teamProfile(){
        return "player/playerProfile";
    }


}
