package com.skilldistillery.airports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.skilldistillery.airports.data.AirportDaoJpaImpl;

@SpringBootApplication
public class AirportsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportsApplication.class, args);
		
	}

}
