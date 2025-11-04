package com.BankingApplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.BankingApplication.dto.AccountDto;
import com.BankingApplication.entity.Account;
import com.BankingApplication.mapper.AccountMapper;
import com.BankingApplication.repository.AccountRepository;
import com.BankingApplication.service.AccountService;

public class AccountServiceImp  implements AccountService{
	@Autowired
private AccountRepository accountRepository;
	public AccountServiceImp(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
		
	}
	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		
		return null;
	}

}
