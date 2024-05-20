package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.DestinationActivityDto;


public interface DestinationActivityRepository extends JpaRepository<DestinationActivityDto, Integer>{

	}
