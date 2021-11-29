	package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Jdbc {
		public static void main(String args[])throws Exception 
		{
			 Class.forName("com.mysql.jdbc.Driver");
			   String mysqlConnUrl = "jdbc:mysql://localhost:3306/java19";
			   String mysqlUserName = "root";
			   String mysqlPassword = "ramesh31629";
			   java.sql.Connection con = DriverManager.getConnection(mysqlConnUrl, mysqlUserName , mysqlPassword);
			   Statement stmt=con.createStatement();
			   int n=stmt.executeUpdate("insert into student values(31629,'Ramesh',18)");
			   int m=stmt.executeUpdate("insert into student values(1,'Felix',20)");
			   int a=stmt.executeUpdate("insert into student values(2,'jack',19)");
			   int b=stmt.executeUpdate("insert into student values(3,'mark',21)");
			   System.out.println(n);

		 }
	}
