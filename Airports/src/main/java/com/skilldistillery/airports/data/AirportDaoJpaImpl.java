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
	
	@Override
	public Airport findByIcaoCode(String icaoCode) {
		
		String jpql = "SELECT a FROM Airport a WHERE a.icaoCode = :icaoCode";
		
		return em.createQuery(jpql, Airport.class).setParameter("icaoCode", icaoCode).getSingleResult();
	}
	
	@Override
	public Airport searchByAirportName(String airportName) {
		
		String jpql = "SELECT a FROM Airport a WHERE a.airportName LIKE CONCAT('%', :airportName, '%')";
		
		return em.createQuery(jpql, Airport.class).setParameter("airportName", airportName).getSingleResult();
	}
	
//	@Override
//	public boolean createNewAirport(Airport airport) {
//		
//		String jpql = "SELECT a FROM Airport a WHERE a.airportName LIKE CONCAT('%', :airportName, '%')";
//		
//		return em.contains(airport);
//	}

}
