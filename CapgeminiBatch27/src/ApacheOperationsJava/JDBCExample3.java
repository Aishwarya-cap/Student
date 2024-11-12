package ApacheOperationsJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample3 {

	
		
		static final String DB_URL="jdbc:mysql://localhost/student";
		static final String USER= "root";
		static final String PASS="";
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try (Connection conn=DriverManager.getConnection(DB_URL, USER,PASS);
			
					Statement stmt = conn.createStatement();
				)
			
			{
				
					System.out.println("Inserting records into the table...");
					String sql="INSERT INTO Regestration VALUES(100,'aishu','avi',24) ";
					stmt.executeUpdate(sql);
					sql="INSERT INTO Regestration VALUES(101,'aishwrya','avinash',23) ";
					stmt.executeUpdate(sql);
					sql="INSERT INTO Regestration VALUES(102,'aishwarya','patil',25) ";
					stmt.executeUpdate(sql);
					sql="INSERT INTO Regestration VALUES(103,'avinash','tanniru',22) ";
					stmt.executeUpdate(sql);
					System.out.println("Inserted record into the table...");
					
					
			
	

				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
}
		
