package com.techcrack.DataBaseOperation;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Creating connection from our appliaction
 * to database(mysql) with support of jdbc
 * here we will only connecting the database
 */
public class DataBaseConnector {
	
	/*
	 * Basic Details Required to access database
	 * user name,password etcc...
	 * inistating it as instance state
	 * And the instance states are encapsulated from other classes
	 */
	private String userName="root";
	private String passWord="KavinDharani@3";
	private String driverLoader="com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/ngpit";
	
	//Connection Object
	private Connection connect=null;
	
	/*
	 * creatinng object for connection while class is instantiated
	 */
	public DataBaseConnector(){
		connect();
	}
	
	//Actual implementation of object craetion for connection
	private void connect() {
		try {
			Class.forName(driverLoader);
			connect=DriverManager.getConnection(url,userName,passWord);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * Returning the Connection Object
	 */
	public Connection getConnection() {
		return connect;
	}
}
