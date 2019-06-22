package com.IngBanking.dto;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Getter@Setter
@EqualsAndHashCode 
@ToString
public class AccountSummeryDTO implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	private String accountNumber;
	private Double balance;
	private String accountType;
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public AccountSummeryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
