package com.skilldistillery.airports.data;

import com.skilldistillery.airports.entities.Airport;

public interface AirportDAO {
	
	Airport findById(int airportId);
	public Airport findByIcaoCode(String icaoCode);
	public Airport searchByAirportName(String airportName);

}
