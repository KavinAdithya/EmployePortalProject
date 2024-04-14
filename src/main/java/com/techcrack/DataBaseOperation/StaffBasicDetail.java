package com.techcrack.DataBaseOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import com.techcrack.Staff;

/*
 * This  Class purpose is to  get the details Of Staff
 * Written Into the dataBase
 */
public class StaffBasicDetail {
	/*
	 * DataBase Connected Object which can
	 * return the connection Object
	 */
	DataBaseConnector dbc=null;
	Connection connect=null;
	
	/*
	 * Instatiating the instance variable is mandatory while creation of object
	 */
	StaffBasicDetail(DataBaseConnector dbc){
		this.dbc=dbc;
		connect=dbc.getConnection();
	}
	
	/*
	 * While Invoking the method it 
	 * requires an object of type staff 
	 * which contains data About Tha client
	 */
	public void updateStaffData(Staff staff) throws SQLException {
		
		/*
		 * Using prepared statement which we caan write the query before we execute
		 * the query we needed to update the required data
		 */
		String query="INSERT INTO staffBasicDetail VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st=null;
		
		//Getting object of prepared statement using connection object
		try {
		st=connect.prepareStatement(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Updating actual data into Query
		st.setInt(1,staff.getId());
		st.setString(2,staff.getName());
		st.setInt(3,staff.getAge());
		st.setString(4, staff.getDate());
		st.setString(5,staff.getSex());
		st.setString(6,staff.getDepartment());
		st.setString(7, staff.getJdate());
		st.setString(8,staff.getQualification());
		st.setString(9,staff.getName()+staff.getId());
		st.setString(10,staff.getUserName());
		st.setString(11,staff.getPassWord());
		
		//Executing the Query
		System.out.println(st.executeUpdate()+" rows affected..");
		createTable(staff);
	}
	
	private void createTable(Staff staff) {
		
		//Query for Creating a table which is used to store the transaction of single staff
		String query="CREATE TABLE "+staff.getName()+staff.getId()+"(date_id Date,deposit DECIMAL(10000,10000))";
		Statement st=null;
		
		//Creating object from connection object
		try {
			 st=connect.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Executing the query
		try {
			st.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public Staff getDataOfStaff(String userName,String passWord) {
		Statement st=null;
		try {
			st=connect.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Query To retireve data from database when data matches it will return data else it will return null
		String query="SELECT * FROM staffBasicDetail WHERE userName="+"'"+userName+"'"+" AND passWord = '"+passWord+"'";
		ResultSet rs=null;
		try {
			rs=st.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(rs==null)
			return null;
		Staff staff=new Staff();
		try {
			rs.next();
		
			staff.setId(rs.getInt(1));
			staff.setName(rs.getString(2));
			staff.setAge(rs.getInt(3));
			staff.setDate(rs.getString(4));
			staff.setSex(rs.getString(5));
			staff.setDepartment(rs.getString(6));
			staff.setJdate(rs.getString(7));
			staff.setQualification(rs.getString(8));
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return staff;
	}
}
