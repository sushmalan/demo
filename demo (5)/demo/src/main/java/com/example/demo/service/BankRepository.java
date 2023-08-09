package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Bank;

public interface BankRepository extends JpaRepository<Bank, BigDecimal> {

}
