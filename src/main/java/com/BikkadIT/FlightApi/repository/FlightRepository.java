package com.BikkadIT.FlightApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.FlightApi.model.Flight;
@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer>{

	
	
	
}
