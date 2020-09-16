//package com.cts.controller;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.assertj.core.util.Arrays;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import com.cts.bean.User;
//import com.cts.service.UserService;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(UserController.class)
//public class usercontroller {
//    
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@MockBean
//	private UserService userservice;
//	
//	@Test
//	public void getAllTest() throws Exception{
//		when(userservice.getAll()).thenReturn(
//				Arrays.asList(new User(1,"abcd","xyzx","member")));
//		
//		RequestBuilder request=MockMvcRequestBuilders
//				.get("/user/getAll")
//				.accept(MediaType.APPLICATION_JSON);
//		
//		MvcResult result=mockMvc.perform(request)
//				        .andExpect(status().isOk())
//				        .andExpect(content().json("[{userId:1,userName:abcd,password:xyzx,role:member}]"))
//		                .andReturn();
//	}
//	
//}
