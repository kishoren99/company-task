package com.example.demo.dto;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class DestinationFaqDto {
	@Id
	private int id;
//	@ManyToOne
//	@JoinColumn(name = "destination_id")
//	private DestinationDto destination;
	private String question;
	private String answer;
	private int priority;
	private Boolean isActive;
	private Timestamp startDate;
	private Timestamp updateDate;
	private Timestamp endDate;

}
