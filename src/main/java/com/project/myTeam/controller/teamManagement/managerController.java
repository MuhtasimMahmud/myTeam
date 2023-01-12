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

    @GetMapping("/managerDashboard")
    public String adminUser(Model model, Principal principal){

        User teamManagement = userRepository.findByEmail(principal.getName());

        model.addAttribute("loggedInUserName", teamManagement.getName());
        return "teamManagement/managerDashboard";
    }

}
