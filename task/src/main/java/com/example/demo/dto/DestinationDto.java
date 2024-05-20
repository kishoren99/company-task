package com.example.demo.dto;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class DestinationDto {
	@Id
	private int id;
	private String city;
	private String region;
	private String country;
	private String image;
	private String header;
	private String description1;
	private String description2;
	private String description3;
	private String description4;
	private String description5;
	private Double longitude;
	private Double latitude;
	private String currencyCode;
	private String currencyName;
	private Timestamp timeZone;
	private String bestTimeVisit;
	private String locUrl;
	private Boolean honeymoon;
	private Boolean family;
	private Boolean trekking;
	private Boolean beach;
	private Boolean island;
	private Boolean isCity;
	private Boolean adventure;
	private Boolean historical;
	private Boolean devotional;
	private Boolean museum;
	private Boolean zoopark;
	private Boolean hillstation;
	private Boolean waterfalls;
	private Boolean isActive;
	private Timestamp startDate;
	private Timestamp updateDate;
	private Timestamp endDate;
//
//	@OneToMany(mappedBy = "destination", cascade = CascadeType.ALL)
//	private List<DestinationActivityDto> activities;
//
//	@OneToMany(mappedBy = "destination", cascade = CascadeType.ALL)
//	private List<DestinationFaqDto> faqs;

}
