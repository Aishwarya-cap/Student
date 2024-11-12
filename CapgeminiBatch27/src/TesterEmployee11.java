
public class TesterEmployee11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Developer11 result=new Developer11();
		int sar=result.Salary();
		System.out.println("Employee Salary::"+sar);
		System.out.println("------------------------------------");
		String Detail=result.Detail();
		System.out.println("Employee Name is::"+Detail);
		
		System.out.println();
		
		Tester11 output=new Tester11();
		int srl=output.Salary();
		System.out.println("Employee Salary::"+srl);
		System.out.println("------------------------------------");
		String Det=output.Detail();
		System.out.println("Employee Name is::"+Detail);
	}
	
	

}
