package student_contact_info.service;


import student_contact_info.dao.student_contact_infoDao;
import student_contact_info.domain.student_contact_info;

/**
 * logic functions such as register, login
 * @author 
 *
 */
public class student_contact_infoService {
	private student_contact_infoDao entity1Dao = new student_contact_infoDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(student_contact_info form) throws student_contact_infoException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		student_contact_info entity1 = entity1Dao.findByUIN(form.getUin());
		if(entity1.getUin()!=null && entity1.getUin().equals(form.getUin())) throw new student_contact_infoException("This user name has already been registered!");
		entity1Dao.add(form);
	}

}
