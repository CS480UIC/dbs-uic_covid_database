package uic_classes.service;


import student_info.service.student_infoException;
import uic_classes.dao.uic_classesDao;
import uic_classes.domain.uic_classes;

/**
 * logic functions such as register, login
 * @author Aayush Makharia
 *
 */
public class uic_classesService {
	private uic_classesDao entity1Dao = new uic_classesDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(uic_classes form) throws uic_classesException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		uic_classes entity1 = entity1Dao.findByUIN(form.getUIN());
		if(entity1.getUIN()!=null && entity1.getUIN().equals(form.getUIN())) throw new uic_classesException("This user name has been registered!");
		entity1Dao.add(form);
	}

}
