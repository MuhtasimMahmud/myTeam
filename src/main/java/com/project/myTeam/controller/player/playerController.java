package com.project.myTeam.controller.player;

import com.project.myTeam.models.User;
import com.project.myTeam.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/player")
public class playerController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/playerHome")
    public String normalUser(Model model, Principal principal){

        User player = userRepository.findByEmail(principal.getName());

        model.addAttribute("loggedInUserName", player.getName());
        return "player/playerHome";
    }

}
