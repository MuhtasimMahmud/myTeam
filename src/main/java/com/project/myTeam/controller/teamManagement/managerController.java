package com.project.myTeam.controller.teamManagement;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teamManagement")
public class managerController {


    @GetMapping("/managerDashboard")
    public String adminUser(){
        return "teamManagement/managerDashboard";
    }

}
