package com.contactUs;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao 
{
	private boolean isUser = true;
	
	public String userLogin(String username,String password)
	{
		String sql= "SELECT * FROM login where email='login@gmail.com' and password= 'login'";
		return sql;

	}

	public boolean isUser() {
		return isUser;
	}

	public void setUser(boolean isUser) {
		this.isUser = isUser;
	}
	

}
