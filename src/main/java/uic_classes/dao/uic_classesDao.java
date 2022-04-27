package uic_classes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import uic_classes.domain.uic_classes;

/**
 * DDL functions performed in database
 */
public class uic_classesDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "uic_covid_database"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "banana"; //TODO change password

	public uic_classes findByUIN(Integer UIN_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		uic_classes entity1 = new uic_classes();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
		    String sql = "select * from uic_classes where UIN = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,UIN_p);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer UIN = Integer.parseInt(resultSet.getString("uin"))  ;
		    	
		    	System.out.println(UIN + " " + UIN_p);
		    	if(UIN == UIN_p){
		    		
		    		entity1.setUIN(UIN);
		    		entity1.setCRN(Integer.parseInt(resultSet.getString("crn")));
		    		System.out.println(Integer.parseInt(resultSet.getString("crn")));
		    	}
		    }
		    
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return entity1;
	}	
	
	/**
	 * insert Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public void add(uic_classes form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
			
			String sql = "insert into uic_classes (UIN, CRN) values(?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getUIN());
		    preparestatement.setInt(2,form.getCRN());
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
	public void update(uic_classes form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
//			
//			String sql = "UPDATE entity1 SET password = ?, email = ? where username = ?;";
//			PreparedStatement preparestatement = connect.prepareStatement(sql); 
//		    preparestatement.setInt(1,form.getUIN());
//		    preparestatement.setInt(2,form.getCRN());
//		    preparestatement.executeUpdate();
//		    connect.close();
//		} catch(SQLException e) {
//			throw new RuntimeException(e);
//		}
	}
	
	
	/**
	 * @param username
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void delete(String username) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
//			
//			String sql = "delete from entity1 where username = ?";
//			PreparedStatement preparestatement = connect.prepareStatement(sql); 
//		    preparestatement.setString(1,username);
//		    preparestatement.executeUpdate();
//		    connect.close();
//		} catch(SQLException e) {
//			throw new RuntimeException(e);
//		}
	}
}
