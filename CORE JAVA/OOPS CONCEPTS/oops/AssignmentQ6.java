package oops;



abstract class Persistence {
   abstract public String persist();
}
class FilePersistence extends Persistence{
   @Override
   public String persist() {
   	return "This is FilePersistance";
   }
}
class DatabasePersistence extends Persistence{
   @Override
   public String persist() {
   	return "This is DatabasePersistance";
   }
}
class Client{
	 

	public static Persistence getPersistence() {
		if(Math.random()*10>5)
			return new FilePersistence();
		else {
			return new DatabasePersistence();
		}
	}
	
}

public class AssignmentQ6 {
	  public static void main(String[] args) {
	    	Persistence client=Client.getPersistence();
	    	System.out.println(client.persist());
	    }
	}


