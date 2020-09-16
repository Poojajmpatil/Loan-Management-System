//package com.cts.service;
//
//import static org.junit.Assert.assertEquals;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import com.cts.bean.Loan;
//import com.cts.repository.LoanRepository;
//
//@RunWith(MockitoJUnitRunner.class)
//public class LoanService {
//
//	@Mock
//	private LoanRepository repo;
//	
//	@InjectMocks
//	private LoanService service;
//	
//	@Test
//	public void testGetLoanByLoanNumber() {
//		List<Loan> list=new ArrayList<>();
//		Loan loan=new Loan(1,5000,5,"pooja","patil","676347676","active",2018-02-1,"adhar");
//	    list.add(loan);
//	    Mockito.when(repo.findByLoanId(1)).thenReturn(list);
//	    List<Loan> loanList=service.findByLoanId(1);
//	    assertEquals(1,loanList.size());
//		
//	}
//}
