package com.project.myTeam.controller.teamManagement;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
@RequestMapping("/teamManagement")
public class managerController {


    @GetMapping("/managerDashboard")
    public String adminUser(Model model, Principal principal){

        model.addAttribute("loggedInUserName", principal.getName());
        return "teamManagement/managerDashboard";
    }

}
