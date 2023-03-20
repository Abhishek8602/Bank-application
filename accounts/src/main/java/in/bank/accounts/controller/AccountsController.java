package in.bank.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

//import in.bank.accounts.config.AccountsConfigService;
import in.bank.accounts.model.Accounts;
import in.bank.accounts.model.Customers;
//import in.bank.accounts.model.ConfigProp;
import in.bank.accounts.repository.AccountRepository;


@RestController
@JacksonStdImpl
public class AccountsController {
	
	@Autowired
	private AccountRepository accountRepository;

	
	@PostMapping("/accounts")
	public Accounts getAccountDetails(@RequestBody Customers customer)
	{
		Accounts accounts = accountRepository.findByCustomerId(customer.getCustomerId());
		return accounts;
	}

		
		
	}


