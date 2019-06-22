package com.IngBanking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IngBanking.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	public  List<Account> findByAccountId(Long userId);	

}
