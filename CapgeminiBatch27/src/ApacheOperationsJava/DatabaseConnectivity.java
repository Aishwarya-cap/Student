
package ApacheOperationsJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectivity {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String url="jdbc:mysql://localhost/department";
		String userNmae="root";
		String password="";
		
		try {;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, userNmae, password);
			//DriverManager.getConnection(url,userNmae,password);
			//System.out.println("Database connection establish seccesfully");
			Statement statement=con.createStatement();
//			int set1=statement.executeUpdate("ALTER TABLE EMPLOYEE ADD SALARY INT(10)");
			int set2=statement.executeUpdate("INSERT INTO EMPLOYEE (EMP_ID,EMP_NAME, EMP_CITY, EMP_DESIGNATION, SALARY) VALUES (101,'Aishwarya','Solapur','Developer',20000),(102,'Avinash','Guntur','Developer',30000),(103,'Jaan','Banglorw','S/W',30000),(104,'avi','Pune','Project',40000),(105,'Aishu','Mumbai','MiniProject',50000)");
			ResultSet set=statement.executeQuery("SELECT EMP_ID,EMP_NAME,SALARY FROM EMPLOYEE");
			
			
			while(set.next())
			{
				int emp_id=set.getInt("EMP_ID");
				String emp_name=set.getString("EMP_NAME");
				int sal=set.getInt("SALARY");
				System.out.println(emp_id+"||"+emp_name+"||"+sal);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
