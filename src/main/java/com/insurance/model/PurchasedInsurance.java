package com.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="PURCHASED_INSURANCE")
@Data
public class PurchasedInsurance {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long purchasedInsuranceId;
	
	private String firstName;
	private String lastName;


	private Long userId;

}
