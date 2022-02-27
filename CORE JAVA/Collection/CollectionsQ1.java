package Collection;
import java.util.TreeMap;
public class CollectionsQ1 {
	
	

		public static void main(String[] args)
		{
			TreeMap<Long,String> contact=new TreeMap<>();
			contact.put((long) 924657133, "Krishna");
			contact.put((long) 984817733, "Rithwik");
			contact.put((long) 879003177, "Suresh");
			contact.put((long) 703218867, "Vignesh");
			System.out.println(contact.keySet());
			System.out.println(contact.values());
			System.out.println(contact);
		}
	}


