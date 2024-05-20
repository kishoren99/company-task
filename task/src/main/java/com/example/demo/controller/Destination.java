package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DestinationActivityDto;
import com.example.demo.dto.DestinationDto;
import com.example.demo.dto.DestinationFaqDto;
import com.example.demo.service.DestinationService;

@RestController
@RequestMapping("/destinations")
public class Destination {
		
	@Autowired 
	DestinationService destinationService;
	
	@PostMapping
	public List insert(@RequestBody List list) {
		return list;
//		return destinationService.insert(destinationDto);
	}
}
