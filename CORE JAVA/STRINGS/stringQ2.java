import java.util.Scanner;

public class stringQ2 {

	public static void main(String[] args) {
		Scanner scanner= new  Scanner(System.in);
		System.out.print("Enter first word :");
		String word = scanner.nextLine();
		System.out.print("Enter second word :");
		String word2 = scanner.nextLine();
		System.out.println("String after Join two Words is "+word+" "+word2);
		scanner.close();

	}

}
