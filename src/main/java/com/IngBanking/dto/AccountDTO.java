package com.IngBanking.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountDTO implements Serializable {

	private static final long serialVersionUID = 1L;
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
