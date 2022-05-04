package vaccination_card.domain;

import java.sql.Date;

/**
 * User object
 * 
 * @author
 * 
 */
public class vaccination_card {
	/*
	 * Correspond to the user table
	 */
	
	private Integer UIN;
	private String name; 
	private Date first_dose;
	private Date second_dose;
	private Integer booster_dose; 
	private String name_of_vaccine;
	
	public Integer getUIN() {
		return UIN;
	}
	public void setUIN(Integer uIN) {
		UIN = uIN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getFirst_dose() {
		return first_dose;
	}
	public void setFirst_dose(Date first_dose) {
		this.first_dose = first_dose;
	}
	public Date getSecond_date() {
		return second_dose;
	}
	public void setSecond_date(Date second_date) {
		this.second_dose = second_date;
	}
	public Integer getBooster_date() {
		return booster_dose;
	}
	public void setBooster_date(Integer booster_date) {
		this.booster_dose = booster_date;
	}
	public String getName_of_vaccine() {
		return name_of_vaccine;
	}
	public void setName_of_vaccine(String name_of_vaccine) {
		this.name_of_vaccine = name_of_vaccine;
	}
	
}
