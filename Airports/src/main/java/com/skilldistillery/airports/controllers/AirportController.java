package com.skilldistillery.airports.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.airports.data.AirportDAO;
import com.skilldistillery.airports.entities.Airport;

@Controller
public class AirportController {
	
	@Autowired
	private AirportDAO dao;
	
	@RequestMapping(path= {"/", "home.do"})
	public String home(Model model) {
//		model.addAttribute("DEBUG", dao.findById(3478));
//		model.addAttribute("airports", dao.findByIcaoCode("KDAB"));
//		model.addAttribute("airportSearch", dao.searchByAirportName("Daytona Beach"));
//		model.addAttribute("state", dao.searchByState("Colorado"));
		
		return "home";
	}
	
	@RequestMapping(path= {"getAirportsByState.do"})
	public String searchByState(String state, Model model) {
		
		List<Airport> airportList = dao.searchByState(state);
		if (airportList == null || airportList.isEmpty()) return "airportnotfound";
		model.addAttribute("airportsByState", airportList);
		model.addAttribute("searchedState", state);
		
		return "airports";
	}
	
	@RequestMapping(path= {"newAirport.do"})
	public String createNewAirport(String name, String city, String state, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("city", city);
		model.addAttribute("state", state);
		
		return "newairport";
	}
	
	@RequestMapping(path= {"search.do"})
	public String searchDb(String query, Model model) {
		
		List<Airport> airportList = dao.searchDb(query);
		if (airportList == null || airportList.isEmpty()) return "airportnotfound";
		model.addAttribute("airportsByState", airportList);
		
		return "airports";
	}
	

}
