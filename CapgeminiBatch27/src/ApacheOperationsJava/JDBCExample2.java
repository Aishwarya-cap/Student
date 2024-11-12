package ApacheOperationsJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {

	
		
		static final String DB_URL="jdbc:mysql://localhost/student";
		static final String USER= "root";
		static final String PASS="";
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try (Connection conn=DriverManager.getConnection(DB_URL, USER,PASS);
			
					Statement stmt = conn.createStatement();
				)
			
			{
				
					String sql = "CREATE TABLE REGESTRATION "+
						"(id INTEGER not NULL, "+
						" first VARCHAR(255), "+
					   " last VARCHAR(255), "+
						" age INTEGER, "+
					"PRIMARY KEY(id))";
				
			
	

				stmt.executeUpdate(sql);
				System.out.println("Created Table in Given Database....");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
		