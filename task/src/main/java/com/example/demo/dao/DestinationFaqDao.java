package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.DestinationFaqDto;
import com.example.demo.repository.DestinationFaqRepository;

@Repository
public class DestinationFaqDao {

	@Autowired
	DestinationFaqRepository destinationFaqRepository;
	
	public String insert(DestinationFaqDto destinationFaqDto) {
		destinationFaqRepository.save(destinationFaqDto);
		return "data inserted";
	}
}
