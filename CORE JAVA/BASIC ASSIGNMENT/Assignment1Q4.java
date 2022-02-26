package vignesh;
import java.util.Scanner;

class ResultDeclaration{
    public static String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	if(subject1Marks>60) {
    		if(subject2Marks>60) {
    			if(subject3Marks>60) {
    				return "passed";
    			}
    			else
    				return "promoted";
    		}
    		else if(subject3Marks>60)
    			return "promoted";
    		else {
				return "fail";
			}
    	}
    	else if(subject2Marks>60) {
			if(subject3Marks>60) {
				return "promoted";
			}
			else
				return "fail";
		}
    	else {
			return "fail";
		}
    }
		
}

public class Assignment1Q4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double subject1Marks=scanner.nextDouble(),subject2Marks=scanner.nextDouble(),subject3Marks=scanner.nextDouble();
		System.out.print(ResultDeclaration.declareResults(subject1Marks,subject2Marks,subject3Marks));
		scanner.close();

	}
}
	
