package annotations;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	
}

class A{
	@Test
	public int test_case(int a, int b) {
		return a+b;
	}
}

public class Annotations {

	public static void main(String[] args) {
		A objA=new A();
		System.out.println(objA.test_case(10, 5));

	}

}



