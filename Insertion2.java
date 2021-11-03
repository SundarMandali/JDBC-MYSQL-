package Module7;


import java.sql.*;

public class Insertion2 {
public static void main(String[] args) throws Exception {
	String url="jdbc:mysql://localhost:3306/practise";
	String username="root";
	String password="root";
	int empid=4;
	String empname="roshan";
	String query="insert into employee values(?,?)";

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement st=con.prepareStatement(query);
	st.setInt(1, empid);
	st.setString(2,empname);
	
	st.executeUpdate();
	
	
	System.out.println("Given values inserted in the table");
	st.close();
	con.close();
}
}
