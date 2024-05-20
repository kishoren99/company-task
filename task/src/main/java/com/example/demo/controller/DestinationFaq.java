//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.dto.DestinationFaqDto;
//import com.example.demo.service.DestinationFaqService;
//
//@RestController
//@RequestMapping("/destinations")
//public class DestinationFaq {
//
//	@Autowired
//	DestinationFaqService destinationFaqService;
//	
//	@PostMapping
//	public String insert(@RequestBody DestinationFaqDto destinationFaqDto ) {
//		return destinationFaqService.insert(destinationFaqDto);
//	}
//}
