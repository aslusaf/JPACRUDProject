package com.skilldistillery.airports.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.airports.entities.Airport;


@Service
@Transactional
public class AirportDaoJpaImpl implements AirportDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Airport findById(int airportId) {
		return em.find(Airport.class, airportId);
	}

}
