package com.skilldistillery.airports.data;

import java.util.List;

import com.skilldistillery.airports.entities.Airport;

public interface AirportDAO {
	
	Airport findById(int airportId);
	public Airport findByIcaoCode(String icaoCode);
	public List<Airport> searchByAirportName(String airportName);
	public List<Airport> searchByState(String state);
	public boolean createNewAirport(Airport airport);
	public List<Airport> searchDb(String query);

}
