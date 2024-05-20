package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.DestinationDto;

public interface DestinationRepository extends JpaRepository<DestinationDto, Integer> {}


