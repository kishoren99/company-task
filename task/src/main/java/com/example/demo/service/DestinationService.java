package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DestinationDao;
import com.example.demo.dto.DestinationDto;

@Service
public class DestinationService {

	@Autowired 
	DestinationDao destinationDao;
	
	public String insert(DestinationDto destinationDto) {
		return destinationDao.insert(destinationDto);
	}
}
