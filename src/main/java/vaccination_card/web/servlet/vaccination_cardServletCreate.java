package vaccination_card.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vaccination_card.domain.vaccination_card;
import vaccination_card.service.vaccination_cardException;
import vaccination_card.service.vaccination_cardService;


/**
 * Servlet implementation class UserServlet
 */

public class vaccination_cardServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public vaccination_cardServletCreate() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		vaccination_cardService entity1service = new vaccination_cardService();
		Map<String,String[]> paramMap = request.getParameterMap();
		vaccination_card form = new vaccination_card();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setUIN(Integer.parseInt(info.get(0)));
		form.setName(info.get(1));
		form.setFirst_dose(java.sql.Date.valueOf(info.get(2)));
		form.setSecond_date(java.sql.Date.valueOf(info.get(3)));
		form.setBooster_date(Integer.parseInt(info.get(4)));
		form.setName_of_vaccine(info.get(5));
		
		try {
			entity1service.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | vaccination_cardException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
