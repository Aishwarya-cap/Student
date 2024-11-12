
public class TesterAllBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PrivateBank bank;
		bank=new GetAllBank();
		String PublicBank_name=bank.getBankName();
		System.out.println("Public bank name is::"+PublicBank_name);
		System.out.println("----------------------------------------");
		String PrivateBank_name=bank.getPrivateBank();
		System.out.println("Private Bank name is::"+PrivateBank_name);
	}

}
