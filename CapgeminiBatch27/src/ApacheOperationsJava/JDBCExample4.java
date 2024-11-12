package ApacheOperationsJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample4 {

	
		
		static final String DB_URL="jdbc:mysql://localhost/student";
		static final String USER= "root";
		static final String PASS="";
		static final String QUERY="SELECT id, first, last, age FROM Regestration";
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try (Connection conn=DriverManager.getConnection(DB_URL, USER,PASS);
			
					Statement stmt = conn.createStatement();
				)
			
			{
				 String sql ="UPDATE Regestration "+
			    "SET age= 30 WHERE id in (100,101)";
				stmt.executeUpdate(sql);
				ResultSet rs=stmt.executeQuery(QUERY);
				while(rs.next()) {
					System.out.println("ID:" + rs.getInt("id"));
				   System.out.println(",age:" + rs.getInt("age"));
				   System.out.println(",First:"+ rs.getString("first"));
				   System.out.println(",Last:"+ rs.getString("last"));
				   
							
				}
				rs.close();	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
}
		

