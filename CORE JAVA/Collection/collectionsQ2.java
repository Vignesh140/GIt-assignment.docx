package Collection;

import java.util.HashSet;

public class collectionsQ2 {
	

	public static class Collection_Q2 {
		public static void main(String[] args)
		{
			HashSet<String> hs=new HashSet<>();
			hs.add("Celio");
			hs.add("Indian terrain");
			hs.add("Us.polo");
			hs.add("Hackett");
			hs.add("Levis");
			
			System.out.println("Original");
			System.out.println(hs);
			System.out.println(hs.size());
			
			hs.add("Indian terrain");
			hs.add("Hackett");
			
			System.out.println("After adding duplicate elements");
			System.out.println(hs);
			System.out.println(hs.size());
		}

	}

}
