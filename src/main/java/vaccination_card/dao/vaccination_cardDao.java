package vaccination_card.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//import java.util.ArrayList;
//import java.util.List;

import vaccination_card.domain.vaccination_card;

/**
 * DDL functions performed in database
 */
public class vaccination_cardDao {
	
	/**
	 * user name to connect to the database 
	 */
	private String MySQL_user = "uic_covid_database"; //TODO change user
	
	/**
	 * password of your username to connect to the database
	 */
	private String MySQL_password = "banana"; //TODO change password

	public vaccination_card findByUIN(Integer uin_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		vaccination_card entity1 = new vaccination_card();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
		    String sql = "select * from student_info where UIN = ?";
		    PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,uin_p);
		    ResultSet resultSet = preparestatement.executeQuery();

		    while(resultSet.next()){
		    	Integer UIN = Integer.parseInt(resultSet.getString("uin")) ;
		    	if(UIN.equals(uin_p)){
		    		entity1.setUIN(uin_p);
		    		entity1.setName(resultSet.getString("name"));
		    		entity1.setFirst_dose(java.sql.Date.valueOf(resultSet.getString("first_dose")));
		    		entity1.setSecond_date(java.sql.Date.valueOf(resultSet.getString("second_dose")));
		    		entity1.setBooster_date(Integer.parseInt(resultSet.getString("booster_dose")));
		    		entity1.setName_of_vaccine(resultSet.getString("name_of_vaccine"));
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
	
	public void add(vaccination_card form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
			
			String sql = "insert into vaccination_card (UIN,name,first_dose,second_dose,booster_dose,name_of_vaccine) values(?,?,?,?,?,?)";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setInt(1,form.getUIN());
			preparestatement.setString(2,form.getName());
			preparestatement.setDate(3,form.getFirst_dose());
			preparestatement.setDate(4,form.getSecond_date());
			preparestatement.setInt(5,form.getBooster_date());
			preparestatement.setString(6,form.getName_of_vaccine());
			
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
	public void update(vaccination_card form) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
			
			String sql = "UPDATE vaccination_card SET Name = ?, first_dose = ?, second_dose= ?, booster_dose = ?,name_of_vaccine = ? where UIN = ?;";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
			preparestatement.setInt(1,form.getUIN());
			preparestatement.setString(2,form.getName());
			preparestatement.setDate(3,form.getFirst_dose());
			preparestatement.setDate(4,form.getSecond_date());
			preparestatement.setInt(5,form.getBooster_date());
			preparestatement.setString(6,form.getName_of_vaccine());
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * @param username
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public void delete(String UIN_p) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/uic_covid_database", MySQL_user, MySQL_password);
			
			String sql = "delete from vaccination_card where UIN = ?";
			PreparedStatement preparestatement = connect.prepareStatement(sql); 
		    preparestatement.setInt(1,Integer.parseInt(UIN_p));
		    preparestatement.executeUpdate();
		    connect.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
