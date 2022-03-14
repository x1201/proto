package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	

	@RequestMapping(value = "/")
	    public String home(){
	        return "home";
	    }
	    @GetMapping("/home")
	    public String home2(){
	        return "home";
	    }
}
