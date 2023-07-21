package com.jdbc;

import java.sql.*;

public class Update {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Java", "root", "");
			
			PreparedStatement st= con.prepareStatement("Update Student set name ='Rahul',per=87 where rollno=1 ");
			
			int n=st.executeUpdate();
			
			System.out.println(n+"record inserted ");
			
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
