package ques1.spring.assignment;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ques1.spring.assignment.Customer;

public class CustomerTest {
	ApplicationContext context;
	Customer customer;
	@BeforeEach
	void berfoeEach() {
		context = new ClassPathXmlApplicationContext("Ques1.xml");
		customer=(Customer) context.getBean("customer");
	}

	@Test
	@DisplayName("First Test case")
	void test1() {
		String expected = "[ ID : 952 Name : Naga Number : 9515962633 Address : ( Street : Majestic function hall line City : Kurnool State : AP zip : 518006 Counrty : India)]";
		assertEquals(expected, customer.toString());
	}

}


