package ques8.spring.assignment;



import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class Dog implements InitializingBean, DisposableBean {
	  private  String name;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	   
	    public void eat(){
	        System.out.println(getName()+" is eating.");
	    }


	    

	  
	    public void myInit(){
	        System.out.println("Dog bean created using init-method");
	    }

	    public  void  myDest(){
	        System.out.println("Object is destroyed using destroy-method");
	    }

	  
	    @PostConstruct
	    public void postConstruct(){
	        System.out.println("using annontation init called");
	    }

	    @PreDestroy
	    public  void  preDestroy(){
	        System.out.println("destroy called using preDestroy annotation");
	    }

		public void destroy() throws Exception {

			
		}

		public void afterPropertiesSet() throws Exception {
		
			
		}

	
	}