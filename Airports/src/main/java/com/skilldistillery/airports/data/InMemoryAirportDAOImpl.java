package com.skilldistillery.airports.data;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.airports.entities.Airport;

public class InMemoryAirportDAOImpl implements AirportDAO {
	
	private List<Airport> airports;
	
	public InMemoryAirportDAOImpl() {
		airports = new ArrayList<>();
		
		
		airports.add(new Airport());
		
		
	}

	@Override
	public Airport findById(int airportId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airport> searchDb(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Airport findByIcaoCode(String icaoCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airport> searchByAirportName(String airportName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Airport> searchByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createNewAirport(Airport airport) {
		// TODO Auto-generated method stub
		return false;
	}

}
