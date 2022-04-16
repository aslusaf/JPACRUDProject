package com.skilldistillery.airports.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "icao_code")
	private String icaoCode;

	@Column(name = "airport_type")
	private String airportType;

	@Column(name = "airport_name")
	private String airportName;

	@Column(name = "latitude_degrees")
	private Double latitude;

	@Column(name = "longitude_degrees")
	private Double longitude;

	@Column(name = "elevation_feet")
	private Integer elevation;

	@Column(name = "country_name")
	private String countryName;

	@Column(name = "country_abbreviation")
	private String countryAbbreviation;

	@Column(name = "state_name")
	private String stateName;

	@Column(name = "state_abbreviation")
	private String stateAbbreviation;

	@Column(name = "city_name")
	private String cityName;

	@Column(name = "airport_link")
	private String airportLink;

	@Column(name = "wikipedia_link")
	private String wikipediaLink;

	public Airport() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIcaoCode() {
		return icaoCode;
	}

	public void setIcaoCode(String icaoCode) {
		this.icaoCode = icaoCode;
	}

	public String getAirportType() {
		return airportType;
	}

	public void setAirportType(String airportType) {
		this.airportType = airportType;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Integer getElevation() {
		return elevation;
	}

	public void setElevation(Integer elevation) {
		this.elevation = elevation;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryAbbreviation() {
		return countryAbbreviation;
	}

	public void setCountryAbbreviation(String countryAbbreviation) {
		this.countryAbbreviation = countryAbbreviation;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateAbbreviation() {
		return stateAbbreviation;
	}

	public void setStateAbbreviation(String stateAbbreviation) {
		this.stateAbbreviation = stateAbbreviation;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAirportLink() {
		return airportLink;
	}

	public void setAirportLink(String airportLink) {
		this.airportLink = airportLink;
	}

	public String getWikipediaLink() {
		return wikipediaLink;
	}

	public void setWikipediaLink(String wikipediaLink) {
		this.wikipediaLink = wikipediaLink;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Airport [id=").append(id).append(", icaoCode=").append(icaoCode).append(", airportType=")
				.append(airportType).append(", airportName=").append(airportName).append(", latitude=").append(latitude)
				.append(", longitude=").append(longitude).append(", elevation=").append(elevation)
				.append(", countryName=").append(countryName).append(", countryAbbreviation=")
				.append(countryAbbreviation).append(", stateName=").append(stateName).append(", stateAbbreviation=")
				.append(stateAbbreviation).append(", cityName=").append(cityName).append(", airportLink=")
				.append(airportLink).append(", wikipediaLink=").append(wikipediaLink).append("]");
		return builder.toString();
	}

}
