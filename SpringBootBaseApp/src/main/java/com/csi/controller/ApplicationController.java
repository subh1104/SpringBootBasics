package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ApplicationController {

    @GetMapping
    public String sayWelcome()
    {
        return "Welcome to SV comapany";
    }

    @GetMapping("/service")
    public String sayService()
    {
        return "Software Development Services";
    }
}
