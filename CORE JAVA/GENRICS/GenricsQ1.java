import java.util.HashSet;
class EmployeeObject
{
	static HashSet<Integer> employeeId = new HashSet<>();
	static HashSet<String> employeeName = new HashSet<>();
	static HashSet<Integer> employeeSalary = new HashSet<>();
	static HashSet<String> employeeDepartment = new HashSet<>();
	
	public void addDetails(int id,String name,int salary,String department) 
	{
		
		employeeId.add(id);
		employeeName.add(name);
		employeeSalary.add(salary);
		employeeDepartment.add(department);
	}
	public void displayDetails() 
	{
		System.out.println(employeeId );
		System.out.println(employeeName );
		System.out.println(employeeSalary );
		System.out.println(employeeDepartment );
	}
	
}
public class GenricsQ1 {
	

		public static void main(String[] args) 
		{
			EmployeeObject object = new EmployeeObject();
			object.addDetails(123, "Max", 5000, "EEE");
			object.addDetails(124, "Min", 1000, "ECE");
			object.displayDetails();

		}

	}


