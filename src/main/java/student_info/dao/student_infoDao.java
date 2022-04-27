package student_info.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import student_info.domain.student_info;

/**
 * DDL functions performed in database
 */
public class student_infoDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "uic_covid_database"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "banana"; //TODO change password

	public student_info findByUIN(Integer UIN_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		student_info entity1 = new student_info();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
		    String sql = "select * from student_info where UIN = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,UIN_p);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer UIN = Integer.parseInt(resultSet.getString("uin")) ;
		    	if(UIN.equals(UIN_p)){
		    		entity1.setUin(UIN);
		    		entity1.setCrn(Integer.parseInt(resultSet.getString("CRN")));
		    		entity1.setRec_status(Integer.parseInt(resultSet.getString("rec_status")));
		    		entity1.setHousing_status(Integer.parseInt(resultSet.getString("housing_status")));
		    		entity1.setSymp_status(Integer.parseInt(resultSet.getString("symp_status")));
		    		entity1.setQuarantine_start(java.sql.Date.valueOf(resultSet.getString("quarantine_start")));
		    		entity1.setQuarantine_end(java.sql.Date.valueOf(resultSet.getString("quarantine_end")));
		    		entity1.setLast_test_result(Integer.parseInt(resultSet.getString("last_test_result")));
		    		entity1.setVaccine_status(Integer.parseInt(resultSet.getString("vaccine_status")));
		    		entity1.setRecent_travel_status(Integer.parseInt(resultSet.getString("recent_travel_status")));
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
	
	public void add(student_info form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
			
			String sql = "insert into student_info (UIN, CRN,rec_status, housing_status, symp_status, quarantine_start, quarantine_end, last_test_result, vaccine_status, recent_travel_status) values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getUin());
		    preparestatement.setInt(2,form.getCrn());
		    preparestatement.setInt(3,form.getRec_status());
		    preparestatement.setInt(4,form.getHousing_status());
		    preparestatement.setInt(5,form.getSymp_status());
		    preparestatement.setDate(6,form.getQuarantine_start());
		    preparestatement.setDate(7,form.getQuarantine_end());
		    preparestatement.setInt(8,form.getLast_test_result());
		    preparestatement.setInt(9,form.getVaccine_status());
		    preparestatement.setInt(10,form.getRecent_travel_status());
		    
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
	public void update(student_info form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
			
			String sql = "UPDATE student_info SET CRN = ?, rec_status = ?, housing_status = ?, symp_status = ?, quarantine_start = ?, quarantine_end = ?, last_test_result = ?, vaccine_status = ?, recent_travel_status = ?  where UIN = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,form.getCrn());
			preparestatement.setInt(2,form.getRec_status());
		    preparestatement.setInt(3,form.getHousing_status());
		    preparestatement.setInt(4,form.getSymp_status());
		    preparestatement.setDate(5,form.getQuarantine_start());
		    preparestatement.setDate(6,form.getQuarantine_end());
		    preparestatement.setInt(7,form.getLast_test_result());
		    preparestatement.setInt(8,form.getVaccine_status());
		    preparestatement.setInt(9,form.getRecent_travel_status());
		    preparestatement.setInt(10,form.getUin());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param UIN_p
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void delete(String UIN_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
			
			String sql = "delete from student_info where UIN = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1, Integer.parseInt(UIN_p) );
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
