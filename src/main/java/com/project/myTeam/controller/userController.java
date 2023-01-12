package com.project.myTeam.controller;

import com.project.myTeam.models.User;
import com.project.myTeam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class userController {


    //eikhane just current user find kroar controller ta likhbo ar jodi extra emon kichu dorkar hoy jeta both type of user er e ase emon kichu eikhane likhbo


    @Autowired
    UserRepository userRepository;


    @ResponseBody
    @GetMapping("/currentLoggedInUserName")
    public String currentUser(Principal principal){

        User currentUser = userRepository.findByEmail(principal.getName());
        return currentUser.getName();

    }


}
