package com.skilldistillery.airports;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.skilldistillery.airports.data.AirportDaoJpaImpl;
import com.skilldistillery.airports.entities.Airport;

@SpringBootTest
class AirportsApplicationTests {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private AirportDaoJpaImpl dao;
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
	@DisplayName("Test findByIcaoCode")
	void test1() {
		
		assertNotNull(airport);
		assertEquals(airport, dao.findByIcaoCode("KDAB"));
		assertEquals(airport, dao.searchByAirportName("Daytona Beach International Airport"));
		assertEquals(airport, dao.searchByAirportName("Daytona Beach"));
		
	}

}
