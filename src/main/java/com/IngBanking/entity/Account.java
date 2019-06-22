package com.IngBanking.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "Account")
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Account  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
	private Long userId;
	private String firstName;
	private String lastName;
	private String address;
	private int age;
	private String purpose;
	private String email;
	private String city;
	private Long phNum;
	private String accountType;
	private String status;
	private String password;
	private String gender;
	


}
