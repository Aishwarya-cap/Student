package ApacheOperationsJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Training1 {
 
	static final String DB_URL ="jdbc:mysql://localhost/institute";
	static final String USER = "root";
	static final String PASS = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn;
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			
//			String sql = "CREATE DATABASE INSTITUTE";
//			stmt.executeUpdate(sql);
//			System.out.println("Database is created successfully");
			
			
			
			
			
//			String sql = "CREATE TABLE Training "+
//			"(training_id INTEGER PRIMARY KEY , "+
//			" training_name VARCHAR(255), "+
//			" training_duration VARCHAR(255), "+
//			" training_date DATE )";
//			
//			stmt.executeUpdate(sql);
//			System.out.println("Created...");
//			
			
			
//			String sql = "INSERT INTO Training VALUES (111, 'V&V Automation', '3 months', '2024-10-07')";
//			stmt.executeUpdate(sql);
//			
//			sql = "INSERT INTO Training VALUES (112, 'Selenium Java', '2 months', '2024-10-08')";
//			stmt.executeUpdate(sql);
//			
//			sql = "INSERT INTO Training VALUES (113, 'Java Full Stack', '1.5 months', '2024-11-06')";
//			stmt.executeUpdate(sql);
// 
//			sql = "INSERT INTO Training VALUES (114, 'Big Data', '2.5 months', '2024-11-07')";
//			stmt.executeUpdate(sql);
//			
//			System.out.println("Inserted..");
			
			
			
//			String sql = "ALTER TABLE Training ADD training_location VARCHAR(255)";
//			stmt.executeUpdate(sql);
//			System.out.println("added..");
//			
			
		
//			String sql = "UPDATE Training SET training_location = ? where training_id=?";		
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "Pune");
//			pstmt.setInt(2,111);
//			pstmt.executeUpdate();
//			pstmt.setString(1, "Bengaluru");
//			pstmt.setInt(2,112);
//			pstmt.executeUpdate();
//			pstmt.setString(1, "Chennai");
//			pstmt.setInt(2,113);
//			pstmt.executeUpdate();
//			pstmt.setString(1, "Mumbai");
//			pstmt.setInt(2,114);
//			pstmt.executeUpdate();
//			
//			System.out.println("updated..");
			
			
			
//			String sql = "UPDATE Training SET training_duration='3 months' where training_name='Big Data'";
//			stmt.executeUpdate(sql);
//			System.out.println("updated...");
			
			
			 
			
			
			
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
}
 
 