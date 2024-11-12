
public class Testlogincredential {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		logincredential login = new LoginCredential();
		login.setUserId("Capgemini@gmail.com");
		login.setPassword("123456123");
		String id_Login=login.getUserId();
		System.out.println(id_Login);
		System pwd_Login=login.getPassword();
		System.out println(pwd_Login);

	}

}
