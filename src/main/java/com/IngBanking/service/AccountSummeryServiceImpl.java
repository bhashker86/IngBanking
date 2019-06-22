package com.IngBanking.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IngBanking.exception.AccountNotFoundException;
import com.IngBanking.dto.AccountSummeryDTO;
import com.IngBanking.entity.Account;
import com.IngBanking.repository.AccountRepository;

@Service
public class AccountSummeryServiceImpl  implements AccountSummeryService{
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AccountSummeryServiceImpl.class);
	
	
	@Autowired
	private AccountRepository accountSummeryRepository;
	
	
	
	public List<AccountSummeryDTO> getAccountSummeryByAcccountId(Long accountId){
		
		LOGGER.debug("AccountSummeryServiceImpl getAccountSummeryByAcccountId()");
		List<Account> accountList=new ArrayList<>();
		List<AccountSummeryDTO>  accountSummery_list=new ArrayList<>();
		
		
		accountSummeryRepository.findByAccountId(accountId).forEach(v->accountList.add(v));
		
		
		if(accountList.size()<1) {
			throw new AccountNotFoundException("Account with the accont number: "+accountId+"  Not Found ");
		}
		
		
		for(Account account:accountList) {
				AccountSummeryDTO accountSummeryDTO=new AccountSummeryDTO();
				
				accountSummeryDTO.setAccountNumber(account.getAccountNumber());
				accountSummeryDTO.setAccountType(account.getAccountType());
				accountSummeryDTO.setBalance(account.getBalance());
		        
				accountSummery_list.add(accountSummeryDTO);	
		
		}
		
		return accountSummery_list;
		
	}	


}
