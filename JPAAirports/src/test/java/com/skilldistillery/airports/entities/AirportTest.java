package com.skilldistillery.airports.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AirportTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Airport airport;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAAirports");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		airport = em.find(Airport.class, 3478);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		airport = null;
	}

	@Test
	@DisplayName("Airport Entity Mapping")
	void test1() {
		
//		SELECT * FROM airport a WHERE a.icao_code = 'KDAB';
//		+------+-----------+----------------+-------------------------------------+------------------+-------------------+----------------+---------------+----------------------+------------+--------------------+---------------+--------------+-------------------------------------------------------------------+
//		| id   | icao_code | airport_type   | airport_name                        | latitude_degrees | longitude_degrees | elevation_feet | country_name  | country_abbreviation | state_name | state_abbreviation | city_name     | airport_link | wikipedia_link                                                    |
//		+------+-----------+----------------+-------------------------------------+------------------+-------------------+----------------+---------------+----------------------+------------+--------------------+---------------+--------------+-------------------------------------------------------------------+
//		| 3478 | KDAB      | Medium Airport | Daytona Beach International Airport |        29.179899 |        -81.058098 |             34 | United States | US                   | Florida    | FL                 | Daytona Beach | NULL         | https://en.wikipedia.org/wiki/Daytona_Beach_International_Airport |
//		+------+-----------+----------------+-------------------------------------+------------------+-------------------+----------------+---------------+----------------------+------------+--------------------+---------------+--------------+-------------------------------------------------------------------+
		assertNotNull(airport);
		assertEquals("KDAB", airport.getIcaoCode());
		assertEquals("Medium Airport", airport.getAirportType());
		assertEquals("Daytona Beach International Airport", airport.getAirportName());
		assertEquals(29.179899, airport.getLatitude());
		assertEquals(-81.058098, airport.getLongitude());
		assertEquals(34, airport.getElevation());
		assertEquals("United States", airport.getCountryName());
		assertEquals("US", airport.getCountryAbbreviation());
		assertEquals("Florida", airport.getStateName());
		assertEquals("FL", airport.getStateAbbreviation());
		assertEquals("Daytona Beach", airport.getCityName());
		assertEquals("NULL", airport.getAirportLink());
		assertEquals("https://en.wikipedia.org/wiki/Daytona_Beach_International_Airport", airport.getWikipediaLink());
		
	}
	

}
