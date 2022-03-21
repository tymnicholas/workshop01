package com.example.workshop01.controller;

import com.example.workshop01.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired MainService service;

    @GetMapping("/")
    public String main(Model model) {

        String message = service.getMainMessage();
        model.addAttribute("message", message);

        return "index";
    }



}
