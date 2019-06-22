package com.IngBanking.service;

import java.util.List;

import com.IngBanking.dto.AccountSummeryDTO;

public interface AccountSummeryService {
	
public List<AccountSummeryDTO> getAccountSummeryByAcccountId(Long userId);	

}
