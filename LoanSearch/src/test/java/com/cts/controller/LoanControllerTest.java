//package com.cts.controller;
//
//import static org.mockito.Mockito.when;
//
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
////import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
////import org.springframework.test.web.servlet.MockMvcBuilder;
////import org.springframework.test.web.servlet.RequestBuilder;
//
//import com.cts.bean.Loan;
//import com.cts.service.LoanService;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(LoanController.class)
//public class LoanControllerTest {
//	
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@MockBean
//	private LoanService loanservice;
//	
//	@Test
//	public void getLoanByIdTest() {
//		long loanId=1;
//		when(loanservice.findByloanId(loanId))
//		     .thenReturn(Stream.of(new Loan(1,5000,5,"abc","xyz","87675454","active",2020-02-1,"adhar"))
//		    		 .collect(Collectors.toList()));
//	}
//    public void getLoanByfirstName() {
//    	String firstName="pooja";
//    	when(loanservice.findByfirstName(firstName))
//    	  .thenReturn(Stream.of(new Loan(1,5000,5,"abc","xyz","87675454","active",2020-02-1,"adhar"))
//		    		 .collect(Collectors.toList()));
//    }
//    public void getLoanBylastName() {
//    	String lastName="patil";
//    	when(loanservice.findByfirstName(lastName))
//    	  .thenReturn(Stream.of(new Loan(1,5000,5,"abc","xyz","87675454","active",2020-02-1,"adhar"))
//		    		 .collect(Collectors.toList()));
//    }
//}
