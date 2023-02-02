package com.example.fleetapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fleetapp.models.Country;
import com.example.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
		
	//Get All Countries
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}	
	
	//save new country
	public void save(Country country) {
		countryRepository.save(country);
	}
}
