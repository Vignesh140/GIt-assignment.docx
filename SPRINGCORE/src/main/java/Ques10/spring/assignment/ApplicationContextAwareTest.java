package Ques10.spring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContextAware;
public class ApplicationContextAwareTest implements ApplicationContextAware {

	ApplicationContext context;
	public ApplicationContext getContext() {
		return context;
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.context=applicationContext;
	}

}
