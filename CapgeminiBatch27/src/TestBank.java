
public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Axis axis=new Axis();
		Banks b; 
		b= new Axis();
		int rate_interset_axis=b.rateOfInterset();
		System.out.println("Axis rate of interset::" +rate_interset_axis);
		System.out.println("----------------------------------------");
		
		
		//ICIC icic=new ICIC();
		b= new ICIC();
		int rate_interset_icic=b.rateOfInterset();
		System.out.println("Axis rate of interset::" +rate_interset_icic);
		

	}

}
