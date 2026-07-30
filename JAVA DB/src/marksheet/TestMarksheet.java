package marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMarksheet {
	
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/result", "root", "root");

		System.out.println("connection established successfully.... " + conn.getCatalog());

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("select * from marksheet");
		
		System.out.println("Update successful! Rows affected: " + rs);
		
	}
}
