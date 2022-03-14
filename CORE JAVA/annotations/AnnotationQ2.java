package annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
	int AuthorID();
	String Author();
	String Date();
	String Time();
	float Version();
}

@info(AuthorID=0, Author = "Naga", Date = "22-02-2022", Time = "07:00", Version = 1.2f)
class Developer{
	int AuthorID;
	String Author;
	String Date;
	String Time;
	float Version;
	public Developer(int i, String string, String date, String time, float d) {
		super();
		AuthorID = i;
		Author = string;
		Date = date;
		Time = time;
		Version = d;
	}
	public String toString() {
		return "AuthorID:"+AuthorID+" Author:"+Author+" Date:"+Date+" Time:"+Time+" Version:"+Version;
	}
}

public class AnnotationQ2 {
	public static void main(String[] args) {
		Developer dep = new Developer(123,"Vignesh", "22-02-2022", "07:00", 1.2f);
		System.out.println(dep.toString());

	}

}


