
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Developer dev=new Developer();
		System.out.println("Acqier properties from parent class: Employee");
		dev.empId();
		dev.empName();
		dev.empCity();
		System.out.println("Acqier properties from chield class: Employee")
		System.out.println("----------------------");
		System.out.println("----------------------");
		dev.designation();
		dev.salary()*/
		
		
		/*Tester test=new Tester();
		System.out.println("Acqier properties from parent class: Employee");
		System.out.println("----------------------");
		test.empId();
		test.empName();
		test.empCity();
		System.out.println("----------------------");
		System.out.println("Acqier properties from chiled class: Developer");
		test.designation();
		test.salary();
		System.out.println("----------------------");
		System.out.println("Acqier properties from chiled class: Tester");
		System.out.println("----------------------");
		test.domain();*/
	
		
		
		
		Employee[] emp=new Employee[2];
		emp[0]=new Developer();
		emp[1]=new Tester();
		for(int i=0; i<emp.length; i++)
		{
			emp[i].empName();
		}
	}
	
	

}
