package Question7.spring.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Ques7.xml");
		SpEL_Arithmetic SpEL = (SpEL_Arithmetic) context.getBean("spEL_Arithmetic");
		System.out.println(SpEL.Display());
		context.close();
	}

}
