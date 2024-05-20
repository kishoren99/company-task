package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.DestinationFaqDto;

public interface DestinationFaqRepository extends JpaRepository<DestinationFaqDto, Integer> {

}
