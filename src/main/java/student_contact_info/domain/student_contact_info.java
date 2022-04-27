package student_contact_info.domain;

/**
 * student_contact_info object
 * 
 * @author Sahil Gedam
 * 
 */
public class student_contact_info {
	/*
	 * Correspond to the user table
	 */
	private Integer uin;
	private Integer phone_number;
	private String email;
	private Integer emergency_contact;
	

	/**
	 * @return the uin
	 */
	public Integer getUin() {
		return uin;
	}
	/**
	 * @param uin the uin to set
	 */
	public void setUin(Integer uin) {
		this.uin = uin;
	}
	/**
	 * @return the phone_number
	 */
	public Integer getPhone_number() {
		return phone_number;
	}
	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(Integer phone_number) {
		this.phone_number = phone_number;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the emergency_contact
	 */
	public Integer getEmergency_contact() {
		return emergency_contact;
	}
	/**
	 * @param emergency_contact the emergency_contact to set
	 */
	public void setEmergency_contact(Integer emergency_contact) {
		this.emergency_contact = emergency_contact;
	}
	
	
}
