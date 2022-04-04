package ques9.spring.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	  public static void main(String[] args) {
		     AbstractApplicationContext context = new ClassPathXmlApplicationContext("Ques9.xml");
		        context.registerShutdownHook();
		  
		  
		  
	      
	        Beanlifecycle beanLifeCycle=(Beanlifecycle)context.getBean("LifeCycle");
	        beanLifeCycle.display();
	    }

}








