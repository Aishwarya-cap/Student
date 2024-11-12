
public class TestMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multiplication mul = new DisplayMultiplicaton();
		System.out.println("Display Multiplication:" +mul.add(3 , 4));
		
		mul = new MultiplicationVisible();
		System.out.println("Visible Multiplication:" +mul.add(3, 4));

	}

}
