package com.example.demo.dto;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class DestinationActivityDto {

	@Id
//	private int id;
//	@ManyToOne
//	@JoinColumn(name = "destination_id")
//	private DestinationDto destination;
	private String activityName;
	private String images;
	private String description1;
	private String description2;
	private String description3;
	private String description4;
	private String description5;
	private String duration;
	private String durationType;
	private String adultPrice;
	private String childPrice;
	private String infantPrice;
	private String seniorCitizenPrice;
	private String openingHours;
	private String closingHours;
	private String transportation;
	private String safetyInformation;
	private String busTransportation;
	private String trainTransportation;
	private String ferryTransportation;
	private String flightTransportation;
	private String desIncluded;
	private Double longitude;
	private Double latitude;
	private String bookingUrl;
	private String locUrl;
	private String activityUrl;
	private String contactNumber;
	private String contactEmail;
	private String highlights;
	private int priority;
	private Boolean isActive;
	private Timestamp startDate;
	private Timestamp updateDate;
	private Timestamp endDate;

}
