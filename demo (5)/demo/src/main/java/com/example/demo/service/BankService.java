package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bank;

@Service
public class BankService {
	
	@Autowired
	private BankService bankService;
	
	public Bank addbank(Bank bank) {
		return  bankService.addbank(bank);
		
	}
	
		public Bank getallbank(Bank bank) {
			return bankService.getallbank(bank);
		}
		public void deletebank(BigDecimal seqNo) {
			 bankService.deletebank(seqNo) ;
			
		}
		public Bank getByid(BigDecimal seqNo) {
			return bankService.getByid(seqNo);
		}
		
	}


