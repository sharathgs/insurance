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
<<<<<<< HEAD
=======
	private String name;
	private String vihicalmodel;
	private String address;
	private String idProofNumber;
>>>>>>> d6b3ab7ebd8eb86ccbefd1b1f1786065e36aae7b
	private String vehicalno;
	private String model;
	
}
