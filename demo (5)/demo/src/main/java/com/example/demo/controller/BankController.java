package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bank;
import com.example.demo.service.BankService;

@RestController
@RequestMapping("/demo")
public class BankController {
	
	@Autowired
	private BankService bankService;
	
	@PostMapping("banks")
	 public ResponseEntity<?> addbank(@RequestBody Bank bank){
		return new ResponseEntity<Bank>(bankService.addbank(bank),HttpStatus.CREATED);
		 
	 }
	
	@GetMapping("/banks")
	 public ResponseEntity<?> getallbank(@RequestBody Bank bank){
		return new ResponseEntity<Bank>(bankService.getallbank(bank),HttpStatus.OK);
		 
	 }
	@DeleteMapping("/banks/{seqNo}")
	public ResponseEntity<?> deletebank(@PathVariable BigDecimal seqNo){
		bankService.deletebank(seqNo);
		return new ResponseEntity<Bank>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@PostMapping("/banks/{seqNo}")
	public ResponseEntity<?> getByid(@PathVariable BigDecimal seqNo){
		return new ResponseEntity<Bank>(bankService.getByid(seqNo),HttpStatus.OK);
	}
	
	

}
