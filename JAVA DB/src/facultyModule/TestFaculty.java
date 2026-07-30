package facultyModule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestFaculty {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");

		System.out.println("connection established successfully.... " + conn.getCatalog());

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("select * from faculty");
		
		while (rs.next()) {
			System.out.println(rs.getInt("facultyid"));
			System.out.println(rs.getString("facultyName"));
			System.out.println(rs.getString("subject"));
			System.out.println(rs.getString("qualification"));
			System.out.println(rs.getString("experience"));
			System.out.println("--------------");
		}

	}
} 

