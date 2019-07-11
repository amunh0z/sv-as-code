package com.ca.devtest.lisabank.demo.sv.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ca.devtest.lisabank.demo.LisaBankClientApplication;
import com.ca.devtest.lisabank.demo.business.BankService;
import com.ca.devtest.lisabank.wsdl.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LisaBankClientApplication.class)
public class Example {
	static final Log logger = LogFactory.getLog(BasicTest.class);
	@Autowired
	private BankService bankServices;
	
	@Test
	public void getListUser() {
		User[] users = bankServices.getListUser();
		assertNotNull(users);
		printUsers(users);
		assertEquals(9, users.length);
	}

	@Test
	public void getListUser1() {
		User[] users = bankServices.getListUser();
		assertNotNull(users);
		printUsers(users);
		assertEquals(0, users.length);
	}

	@Test
	public void getListUserTemplate() {
		User[] users = bankServices.getListUser();
		assertNotNull(users);
		assertEquals(1, users.length);
		printUsers(users);
	}
	private void printUsers(User[] users) {
		for (User user : users) {
			logger.info(user.getFname() + " " + user.getLname() + " " + user.getLogin());
		}

	}
}
