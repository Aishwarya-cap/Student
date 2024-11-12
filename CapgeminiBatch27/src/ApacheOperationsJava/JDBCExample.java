package ApacheOperationsJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	
		
		static final String DB_URL="jdbc:mysql://localhost/";
		static final String USER= "root";
		static final String PASS="";
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try (Connection conn=DriverManager.getConnection(DB_URL, USER,PASS);)
			
			
			{
				
			
				System.out.println("Connected Database successfully...");
				Statement stmt = conn.createStatement();
				ResultSet rs1=stmt.executeQuery("SHOW DATABASES");
				System.out.println("DATABASE");
				System.out.println("------------------------------------------------");
				while(rs1.next()){
					System.out.println(rs1.getString(1));
				}
				System.out.println();
			
	
//				String sql = "CREATE DATABASE STUDENT";
//				stmt.executeUpdate(sql);
				System.out.println("Database created successfully...");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		

	

}
