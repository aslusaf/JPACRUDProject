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

	@RequestMapping(path = { "/", "home.do" })
	public String home(Model model) {
		return "home";
	}

	@RequestMapping(path = { "getAirportsByState.do" })
	public String searchByState(String state, Model model) {

		if(state.isEmpty() || state == null) return "home";
		List<Airport> airportList = dao.searchByState(state);
		if (airportList == null || airportList.isEmpty())
			return "airportnotfound";
		model.addAttribute("airports", airportList);
		model.addAttribute("query", state);

		return "airportsearch";
	}

	@RequestMapping(path = { "getAirportsByName.do" })
	public String searchByAirportName(String airportName, Model model) {

		if(airportName.isEmpty() || airportName == null) return "home";
		List<Airport> airportList = dao.searchByAirportName(airportName);
		if (airportList == null || airportList.isEmpty())
			return "airportnotfound";
		model.addAttribute("airports", airportList);
		model.addAttribute("query", airportName);

		return "airportsearch";
	}

	@RequestMapping(path = { "newAirport.do" })
	public String createNewAirport(String name, String city, String state, Model model) {

		if (name.isEmpty() || name == null || city.isEmpty() || city == null || state.isEmpty() || state == null)
			return "invalidinput";

		Airport newAirport = new Airport();
		newAirport.setAirportName(name);
		newAirport.setCityName(city);
		newAirport.setStateName(state);

		boolean success = dao.createNewAirport(newAirport);

		if (success) {
			model.addAttribute("createSuccess", 1);
		} else {
			model.addAttribute("createSuccess", -1);
		}

		model.addAttribute("name", name);
		model.addAttribute("city", city);
		model.addAttribute("state", state);
		model.addAttribute("success", success);

		return "home";
	}

	@RequestMapping(path = { "search.do" })
	public String searchDb(String query, Model model) {

		if (query.isEmpty() || query == null)
			return "home";
		List<Airport> airportList = dao.searchDb(query);
		if (airportList == null || airportList.isEmpty())
			return "airportnotfound";
		model.addAttribute("airports", airportList);
		model.addAttribute("query", query);

		return "airportsearch";
	}

	@RequestMapping(path = { "newairportpage.do" })
	public String goToNewAirport() {
		return "newairport";
	}

	@RequestMapping(path = { "goToUpdateAirport.do" })
	public String goToUpdateAirport(int airportId, Model model) {

		Airport airport = dao.findById(airportId);
		if (airport == null)
			return "airportnotfound";
		model.addAttribute("airport", airport);
		model.addAttribute("airportId", airportId);

		return "updateairport";
	}

	@RequestMapping(path = { "updateAirport.do" })
	public String updateAirport(String name, String city, String state, int airportId, Model model) {

		if (name.isEmpty() || name == null || city.isEmpty() || city == null || state.isEmpty() || state == null)
			return "invalidinput";

		dao.updateAirport(name, city, state, airportId);

		Airport airport = dao.findById(airportId);
		boolean success = (airport.getAirportName().equals(name) && airport.getCityName().equals(city)
				&& airport.getStateName().equals(state));

		if (success) {
			model.addAttribute("updateSuccess", 1);
		} else {
			model.addAttribute("updateSuccess", -1);
		}

		model.addAttribute("airport", airport);

		return "home";
	}

	@RequestMapping(path = { "deleteAirport.do" })
	public String deleteAirport(Integer airportId, Model model) {

		if (airportId == null)
			return "invalidinput";

		boolean success = dao.deleteAirport(airportId);

		if (success) {
			model.addAttribute("deleteSuccess", 1);
		} else {
			model.addAttribute("deleteSuccess", -1);
		}

		model.addAttribute("success", success);

		return "home";
	}

}
