package com.jdbc;

import java.sql.*;
import java.util.*;

public class InsertUser {

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
			
			System.out.println("Enter Roll number , Nmae and Percentage ");
			rollno=scan.nextInt();
			name=scan.next();
			per=scan.nextFloat();
			
			PreparedStatement st= con.prepareStatement("Insert into Student values(?,?,?)");
			
			st.setInt(1, rollno);
			st.setString(2, name);
			st.setFloat(3, per);
			
			int n=st.executeUpdate();
			System.out.println(n+"Record Inserted");
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}

