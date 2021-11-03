package Module7;


import java.sql.*;

public class Retrieve {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/practise";
		String username="root";
		String password="root";
		String query="select * from employee";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}

		st.close();
		con.close();
	}
}
