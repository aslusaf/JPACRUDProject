package com.skilldistillery.airports.data;

import java.util.List;

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
	public List<Airport> searchByAirportName(String airportName) {
		
		String jpql = "SELECT a FROM Airport a WHERE a.airportName LIKE CONCAT('%', :airportName, '%')";
		
		return em.createQuery(jpql, Airport.class).setParameter("airportName", airportName).getResultList();
	}
	
	@Override
	public List<Airport> searchByState(String state) {
		
		String jpql = "SELECT a FROM Airport a WHERE a.stateName = :state ORDER BY a.airportName";
		
		return em.createQuery(jpql, Airport.class).setParameter("state", state).getResultList();
	}
	
	@Override
	public List<Airport> searchDb(String query) {
		
		String jpql = "SELECT a FROM Airport a WHERE (a.airportName LIKE CONCAT('%', :query, '%') OR a.icaoCode LIKE CONCAT('%', :query, '%') OR a.airportType LIKE CONCAT('%', :query, '%') OR a.stateName LIKE CONCAT('%', :query, '%') OR a.cityName LIKE CONCAT('%', :query, '%') OR a.countryName LIKE CONCAT('%', :query, '%') OR a.stateAbbreviation LIKE CONCAT('%', :query, '%')) ORDER BY a.airportName";
		
		return em.createQuery(jpql, Airport.class).setParameter("query", query).getResultList();
	}
	
	@Override
	public boolean createNewAirport(Airport airport) {
		
		em.persist(airport);
		
		return em.contains(airport);
	}

}
