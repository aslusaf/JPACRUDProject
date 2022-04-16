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
		airport = em.find(Airport.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		airport = null;
	}

	@Test
	@DisplayName("Airport Entity Mapping")
	void test1() {
		assertNotNull(airport);
		assertEquals("KDAB", airport.getIcaoCode());
	}

}
