package com.project.myTeam.controller.teamManagement;

import com.project.myTeam.models.User;
import com.project.myTeam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/teamManagement")
public class managerController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/managerHome")
    public String adminUser(){
        return "teamManagement/managerHome";
    }


    @GetMapping("/best11")
    public String best11(){
        return "teamManagement/best11";
    }

    @GetMapping("/allPlayers")
    public String allPlayers(){
        return "teamManagement/allPlayers";
    }


    @GetMapping("/injuredPlayers")
    public String injuredPlayers(){
        return "teamManagement/injuredPlayers";
    }

//    @GetMapping("/applications")
//    public String application(){
//        return "teamManagement/applications";
//    }
//
//    @GetMapping("/matchResults")
//    public String results(){
//        return "teamManagement/matchResults";
//    }
//
//    @GetMapping("/teamCode")
//    public String teamCode(){
//        return "teamManagement/teamCode";
//    }


}


