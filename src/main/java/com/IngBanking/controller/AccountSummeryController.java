package com.IngBanking.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IngBanking.dto.AccountSummeryDTO;
import com.IngBanking.service.AccountSummeryService;


@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders= {"*", "*/"}, origins = {"*", "*/"})
public class AccountSummeryController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AccountSummeryController.class);
	
	
	 @Autowired
	 private AccountSummeryService accountSummeryService;
	
	  @GetMapping(value="summary/{accountId}")	
	  public ResponseEntity<List<AccountSummeryDTO>> accountSummery(@PathVariable("accountId") Long accountId){
		  LOGGER.debug("AccountSummeryController:account summery controller");
		return new ResponseEntity<>(accountSummeryService.getAccountSummeryByAcccountId(accountId),HttpStatus.OK);  
		  
	  }	

}
