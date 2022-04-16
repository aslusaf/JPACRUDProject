package com.skilldistillery.airports.data;

import com.skilldistillery.airports.entities.Airport;

public interface AirportDAO {
	
	Airport findById(int airportId);

}
