
public class TrainingSession {
	
	private int id;
	private String name;

	TrainingSession()
	{
		System.out.println("Capagemini Training in seleniu java");
		System.out.println("Location:Bangaluru");
		System.out.println("Automation Testing");
	}
	public TrainingSession(int id,String name)
	
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Id of the employee::" +id+"\n"+"Name of thee employee::"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrainingSession session=new TrainingSession();
		TrainingSession session1=new TrainingSession(1010,"Aishu");
		session.display();
		session1.display();
		

	}

}
