
public class TestAtm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplyAbstract result=new ApplyAbstract();
		int transaction_id=result.transactionId();
		System.out.println("Genrate Transaction ID::"+transaction_id);
		System.out.println("------------------------------------");
		int withdraw_amount=result.withdrawAmount();
		System.out.println("Wothdraw Amount is::"+withdraw_amount);
		

	}

}
