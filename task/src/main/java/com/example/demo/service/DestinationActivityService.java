package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DestinationActivityDao;
import com.example.demo.dto.DestinationActivityDto;

@Service
public class DestinationActivityService {

	@Autowired
	DestinationActivityDao destinationActivityDao;

	public String insert(DestinationActivityDto destinationActivityDto) {
		return destinationActivityDao.insert(destinationActivityDto);
	}
}
