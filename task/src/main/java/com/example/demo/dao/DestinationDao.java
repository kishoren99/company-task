package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.dto.DestinationDto;
import com.example.demo.repository.DestinationRepository;

@Repository
public class DestinationDao {

	@Autowired
	DestinationRepository destinationRepository;

	public String insert(DestinationDto destinationDto) {
		destinationRepository.save(destinationDto);
		return "Data Inserted Sucessfully";

	}
}
