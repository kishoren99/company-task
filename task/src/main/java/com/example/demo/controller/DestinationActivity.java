//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.dto.DestinationActivityDto;
//import com.example.demo.service.DestinationActivityService;
//
//@RestController
//@RequestMapping("/destinations")
//public class DestinationActivity {
//
//	@Autowired
//	DestinationActivityService destinationActivityService;
//
//	@PostMapping
//	public String insert(@RequestBody DestinationActivityDto destinationActivityDto) {
//		return destinationActivityService.insert(destinationActivityDto);
//	}
//}
