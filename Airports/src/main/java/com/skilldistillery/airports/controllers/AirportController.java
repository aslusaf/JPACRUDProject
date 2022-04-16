package com.skilldistillery.airports.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.airports.data.AirportDAO;

@Controller
public class AirportController {
	
	@Autowired
	private AirportDAO dao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String home(Model model) {
		model.addAttribute("DEBUG", dao.findById(3478));
		return "home";
	}

}
