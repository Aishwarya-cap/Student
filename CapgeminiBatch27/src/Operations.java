
public class Operations {

	public int sum(int a, int b)
	{
		return a+b;
		
	}
	public float sum(float a, float b)
	{
		return a+b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operations option = new Operations();
		int sum_integer=option.sum(10,20);
		System.out.println("sum of two integer value::" +sum_integer);
		System.out.println("-------------");
		float sum_float=option.sum(20.0f, 30.0f);
		System.out.println("sum of two float value::"+sum_float);
	}

}
