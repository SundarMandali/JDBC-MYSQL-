package Module7;

import java.sql.*;
public class Insertion {
public static void main(String[] args) throws Exception {
	String url="jdbc:mysql://localhost:3306/practise";
	String username="root";
	String password="root";
//	String query="insert into employee values(1,'sundar')";

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,username,password);
	Statement st=con.createStatement();

	//	st.executeUpdate(query);
	st.executeUpdate("insert into employee values(2,'rohith')");
	st.executeUpdate("insert into employee values(3,'ram')");
	
	System.out.println("Given values inserted in the table");
	st.close();
	con.close();
	
	
}
}

