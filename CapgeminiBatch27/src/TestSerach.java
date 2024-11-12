
public class TestSerach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Search b; 
		b= new Document();
		boolean Document_search=b.search("Aishwarya");
		System.out.println("Axis rate of interset::" +Document_search);
		System.out.println("----------------------------------------");
		
		
		//ICIC icic=new ICIC();
		b= new Webapplication();
		boolean Webapplication_search=b.search("Patil");
		System.out.println("Axis rate of interset::" +Webapplication_search);

	}

}