package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="INSURANCE_DETAILS")
@Data
public class InsurenceDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long insuranceId;
	private String customerName;
	private String mobileNumber;
}
