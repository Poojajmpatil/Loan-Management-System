//package com.cts.repository;
//
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.cts.bean.Loan;
//import com.sun.el.stream.Stream;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class LoanRepository {
//	
//	@MockBean
//	LoanRepository loanRepository;
//	
//	@Test
//	public void testFindByLoanNumber() {
//		long loanId=1;
//		when(loanRepository.findByloanId(loanId))
//		     .thenReturn(Stream.of(new Loan(1,5000,5,"abc","xyz","87675454","active",2020-02-1,"adhar"))
//		    		 .collect(Collectors.toList()));
//
//	}
//
//	private Object findByloanId(long loanId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//}
