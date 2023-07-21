package com.jdbc;

import java.sql.*;
import java.util.*;

public class Delete {

	public static void main(String[] args) 
	{
		int rollno;
		String name;
		float per;
		Scanner scan=new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Java", "root", "");
			
			PreparedStatement st= con.prepareStatement("Delete from Student where rollno=2");
			
			int n=st.executeUpdate();
			System.out.println(n+"Record Inserted");
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}


