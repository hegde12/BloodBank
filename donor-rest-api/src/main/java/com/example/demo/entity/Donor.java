package com.example.demo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="donorinfo")
@NoArgsConstructor
@AllArgsConstructor

public class Donor {

	@Id
	@Column(name="donorId")
	int donorId;
	

	@Column(name="donorName")
	String donorName;
	
	@Column(name="donorAge")
	int donorAge;
	
	@Column(name="bloodgroup")
	String bloodgroup;
	

	@Column(name="areacode")
	int areacode;


}
