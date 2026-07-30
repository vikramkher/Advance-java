package facultyModule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestFacultyDelete {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");

		System.out.println("connection established successfully.... " + conn.getCatalog());

		Statement stmt = conn.createStatement();

		int rs = stmt.executeUpdate("Delete from faculty where facultyid = 40");
		
		System.out.println("Update successful! Rows affected: " + rs);
} 
}
