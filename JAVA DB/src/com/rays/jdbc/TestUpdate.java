package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdate {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");

		Statement stmt = conn.createStatement();

		int rs = stmt.executeUpdate("update st_user set id=7 where id=8");
		
		System.out.println("Update successful! Rows affected: " + rs);


	}

}
