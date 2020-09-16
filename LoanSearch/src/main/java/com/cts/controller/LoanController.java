package com.cts.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.bean.Loan;
import com.cts.service.LoanService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/loan")
public class LoanController {

	@Autowired
	LoanService service;

	Logger logger = LoggerFactory.getLogger(LoanController.class);

	@GetMapping(value = "num/{loanNumber}")
	Optional<Loan> getLoanById(@PathVariable Long loanNumber) {
		logger.info("loan list invoked");
		return service.getLoanById(loanNumber);
	}

	@GetMapping(value = "get/{firstName}")
	Optional<Loan> getLoanByfirstName(@PathVariable String firstName) {
		logger.info("loan list invoked");

		return service.getLoanByfirstName(firstName);
	}

	@GetMapping(value = "name/{lastName}")
	Optional<Loan> getLoanBylastName(@PathVariable String lastName) {
		logger.info("loan list invoked");

		return service.getLoanBylastName(lastName);
	}

}