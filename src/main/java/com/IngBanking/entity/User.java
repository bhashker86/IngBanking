package com.IngBanking.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "user")
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long userId;
	private String userName;
	private String password;
	private String role;
	@OneToMany
	@JoinColumn(name = "accountId")
	private Account account;
}
