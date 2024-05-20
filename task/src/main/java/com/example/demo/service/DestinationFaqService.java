package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.DestinationFaqDao;
import com.example.demo.dto.DestinationFaqDto;

@Repository
public class DestinationFaqService {

	@Autowired 
	DestinationFaqDao destinationFaqDao;
	
	public String insert(DestinationFaqDto destinationFaqDto)
	{
	return	destinationFaqDao.insert(destinationFaqDto);
		
	}
}
