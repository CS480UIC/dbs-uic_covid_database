package student_info.domain;

import java.sql.Date;

/**
 * User object
 * 
 * @author Aayush Makharia
 * 
 */
public class student_info {
	/*
	 * Correspond to the user table
	 */
	
	private Integer uin ;
	private Integer crn ;
	private Integer rec_status;
	private Integer housing_status;
	private Integer symp_status;
	private Date quarantine_start;
	private Date quarantine_end;
	private Integer last_test_result;
	private Integer vaccine_status;
	private Integer recent_travel_status;
	
	
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
	 * @return the rec_status
	 */
	public Integer getRec_status() {
		return rec_status;
	}
	/**
	 * @return the crn
	 */
	public Integer getCrn() {
		return crn;
	}
	/**
	 * @param crn the crn to set
	 */
	public void setCrn(Integer crn) {
		this.crn = crn;
	}
	/**
	 * @param rec_status the rec_status to set
	 */
	public void setRec_status(Integer rec_status) {
		this.rec_status = rec_status;
	}
	/**
	 * @return the housing_status
	 */
	public Integer getHousing_status() {
		return housing_status;
	}
	/**
	 * @param housing_status the housing_status to set
	 */
	public void setHousing_status(Integer housing_status) {
		this.housing_status = housing_status;
	}
	/**
	 * @return the symp_status
	 */
	public Integer getSymp_status() {
		return symp_status;
	}
	/**
	 * @param symp_status the symp_status to set
	 */
	public void setSymp_status(Integer symp_status) {
		this.symp_status = symp_status;
	}

	/**
	 * @return the quarantine_start
	 */
	public Date getQuarantine_start() {
		return quarantine_start;
	}
	/**
	 * @param quarantine_start the quarantine_start to set
	 */
	public void setQuarantine_start(Date quarantine_start) {
		this.quarantine_start = quarantine_start;
	}
	/**
	 * @return the quarantine_end
	 */
	public Date getQuarantine_end() {
		return quarantine_end;
	}
	/**
	 * @param quarantine_end the quarantine_end to set
	 */
	public void setQuarantine_end(Date quarantine_end) {
		this.quarantine_end = quarantine_end;
	}
	/**
	 * @return the last_test_result
	 */
	public Integer getLast_test_result() {
		return last_test_result;
	}
	/**
	 * @param last_test_result the last_test_result to set
	 */
	public void setLast_test_result(Integer last_test_result) {
		this.last_test_result = last_test_result;
	}
	/**
	 * @return the vaccine_status
	 */
	public Integer getVaccine_status() {
		return vaccine_status;
	}
	/**
	 * @param vaccine_status the vaccine_status to set
	 */
	public void setVaccine_status(Integer vaccine_status) {
		this.vaccine_status = vaccine_status;
	}
	/**
	 * @return the recent_travel_status
	 */
	public Integer getRecent_travel_status() {
		return recent_travel_status;
	}
	/**
	 * @param recent_travel_status the recent_travel_status to set
	 */
	public void setRecent_travel_status(Integer recent_travel_status) {
		this.recent_travel_status = recent_travel_status;
	}

}
