package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.DestinationActivityDto;
import com.example.demo.repository.DestinationActivityRepository;

@Repository
public class DestinationActivityDao {

	@Autowired 
	DestinationActivityRepository destinationActivityRepository;
	
	public String insert(DestinationActivityDto destinationActivityDto) {
		destinationActivityRepository.save(destinationActivityDto);
		
		return "data inserted";
	}
	
}
