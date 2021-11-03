package Module7;

import java.sql.*;

public class Basic_Jdbc {
public static void main(String[] args) throws Exception {
	String url="jdbc:mysql://localhost:3306/practise";
	String username="root";
	String password="root";
	String query="create table employee(empid integer,empname varchar(10))";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,username,password);
	Statement st=con.createStatement();
	st.executeUpdate(query);
	System.out.println("Employee Table is created in given Database");
	st.close();
	con.close();
}
}
