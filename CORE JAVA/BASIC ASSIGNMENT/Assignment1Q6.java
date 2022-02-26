package vignesh;

import java.util.Scanner;

class Login{
    static String userId = "Ajay";
	static String password = "password";
	static int i=3;
    public static String loginUser(String user, String pass) { 
    	i--;
    	String z=null;
        		if((user.equals(userId) && pass.equals(password))) {
        			z= "Welcome "+userId;
        			
        		}
        		else if(i>=1) {
        			z="You have entered wrong credentials ,please enter the right credentials\n";
        		}
        		else {
        			z= "You have entered wrong credentials 3 times \nContact Admin"; 
        		}
    		return z;
    	
    	
    }

}

public class Assignment1Q6 {
	public static void main(String[] args) {
		int i=3;
		Scanner  scanner=new Scanner(System.in);
		while(i>0) {
		System.out.println("userId: ");
		String user=scanner.next();
		System.out.println("password: ");
		String pass=scanner.next();
		String name = Login.loginUser(user, pass);
		System.out.print(name);
		i--;
		}
		scanner.close();
	 }

 }


/**class Assignment1Q6 {

	public static void main(String[] args) {
		//String userId = "11",password = "22";
		Scanner scanner=new Scanner(System.in);
		System.out.print("userId: ");
		String userId = scanner.next();
		System.out.print("password: ");
		String password = scanner.next();
		System.out.println(userId + password);
		
		int i=3;
    	do {
    		i--;
    		System.out.print("userId: ");
    		String user = scanner.next();
    		System.out.print("password: ");
    		String pass = scanner.next();
    		if((user.equals(userId))) {
    			System.out.print("Welcome"+userId);
    		}
    		else if(i>=1) {
    			System.out.print("You have entered wrong credentials ,please enter the right credentials");
    		}
    		else {
    			System.out.print("have entered wrong credentials 3 times \nContact Admin"); 	
    		}
    	}while(i>0);
    	scanner.close();

	}

}**/

