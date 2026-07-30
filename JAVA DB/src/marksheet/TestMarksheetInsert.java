package marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestMarksheetInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/result", "root", "root");

		System.out.println("connection established successfully.... " + conn.getCatalog());

		Statement stmt = conn.createStatement();

		int rs = stmt.executeUpdate("insert into marksheet values (4, 'Shiven', 'Chauhan', 85)");
	
		System.out.println("Update successful! Rows affected: " + rs);
	}
}
