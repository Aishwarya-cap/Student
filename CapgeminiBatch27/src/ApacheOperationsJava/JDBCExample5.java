package ApacheOperationsJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample5 {

	
		
		static final String DB_URL="jdbc:mysql://localhost/student";
		static final String USER= "root";
		static final String PASS="";
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				Connection conn=DriverManager.getConnection(DB_URL, USER,PASS);
				
				String upd_qry="update regestration set age = ? where id=?";
				PreparedStatement pstmt= conn.prepareStatement(upd_qry);
				pstmt.setInt(1, 51);
				pstmt.setInt(2, 35);
				pstmt.executeUpdate();
				
				String sel_qry = "select * from regestration where id=35";
				ResultSet rs = pstmt.executeQuery(sel_qry);
				System.out.println("Displaying updated record..");
				while(rs.next()) {
					System.out.println("ID:" + rs.getInt(1));
					   System.out.println(",age:" + rs.getInt(2));
					   System.out.println(",FirstName:"+ rs.getString(3));
					   System.out.println(",LastName:"+ rs.getString(4));
				}
				rs.close();
				pstmt.close();
				conn.close();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
					
					

	}


