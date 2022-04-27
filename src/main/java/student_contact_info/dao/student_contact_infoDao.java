package student_contact_info.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import student_contact_info.domain.student_contact_info;

/**
 * DDL functions performed in database
 */
public class student_contact_infoDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "uic_covid_database"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "banana"; //TODO change password

	public student_contact_info findByUIN(Integer UIN_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		student_contact_info entity1 = new student_contact_info();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
		    String sql = "SELECT * FROM student_contact_info where UIN = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,UIN_p);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer UIN = Integer.parseInt(resultSet.getString("uin")) ;
		    	
//		    	System.out.println("UIN inside Dao :"+  UIN);
//		    	System.out.println("UIN_p inside Dao :"+  UIN_p);
		    	System.out.println(UIN.equals(UIN_p));
		    	
		    	if(UIN.equals(UIN_p)){
		    		entity1.setUin(UIN);
		    		entity1.setEmail(resultSet.getString("Email"));
		    		entity1.setEmergency_contact(Integer.parseInt(resultSet.getString("Emergency_ContactNumber")));
		    		entity1.setPhone_number(Integer.parseInt(resultSet.getString("PhoneNumber")));
		    		
		    	}
		    }
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return entity1;
	}	
	
	/**
	 * insert student_contact_info
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(student_contact_info form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
			
			String sql = "insert into student_contact_info (UIN, PhoneNumber, Email, Emergency_ContactNumber) values(?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getUin());
		    preparestatement.setInt(2,form.getPhone_number());
		    preparestatement.setString(3,form.getEmail());
		    preparestatement.setInt(4,form.getEmergency_contact());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param form
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void update(student_contact_info form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
			
			String sql = "UPDATE student_contact_info SET PhoneNumber = ?, Email = ?, Emergency_ContactNumber = ? where UIN = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getPhone_number());
			preparestatement.setString(2,form.getEmail());
		    preparestatement.setInt(3,form.getEmergency_contact());
		    preparestatement.setInt(4,form.getUin());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param uin_p
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void delete(String uin_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
			
			String sql = "delete from student_contact_info where uin = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, Integer.parseInt(uin_p));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
