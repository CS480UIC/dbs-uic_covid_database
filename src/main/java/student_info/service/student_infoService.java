package student_info.service;


import student_info.dao.student_infoDao;
import student_info.domain.student_info;

/**
 * logic functions such as register, login
 * @author 
 *
 */
public class student_infoService {
	private student_infoDao entity1Dao = new student_infoDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(student_info form) throws student_infoException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		student_info entity1 = entity1Dao.findByUIN(form.getUin());
		if(entity1.getUin()!=null && entity1.getUin().equals(form.getUin())) throw new student_infoException("This student_info has been registered!");
		entity1Dao.add(form);
	}

}
