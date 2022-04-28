package vaccination_card.service;


import vaccination_card.dao.vaccination_cardDao;
import vaccination_card.domain.vaccination_card;

/**
 * logic functions such as register, login
 * @author 
 *
 */
public class vaccination_cardService {
	private vaccination_cardDao entity1Dao = new vaccination_cardDao();
	
	/**
	 * register a Entity1
	 * @param form
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public void create(vaccination_card form) throws vaccination_cardException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		// check the primary key of Entity1
		vaccination_card entity1 = entity1Dao.findByUIN(form.getUIN());
		if(entity1.getUIN()!=null && entity1.getUIN().equals(form.getUIN())) throw new vaccination_cardException("This UIN has been registered!");
		entity1Dao.add(form);
	}
}
