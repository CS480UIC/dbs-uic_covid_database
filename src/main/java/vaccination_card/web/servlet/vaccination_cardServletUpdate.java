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

import vaccination_card.dao.vaccination_cardDao;
import vaccination_card.domain.vaccination_card;

/**
 * Servlet implementation class UserServlet
 */

public class vaccination_cardServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public vaccination_cardServletUpdate() {
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

		String method = request.getParameter("method");
		vaccination_cardDao entity1dao = new vaccination_cardDao();
		vaccination_card entity1 = null;

		if(method.equals("search"))
		{
			try {
				//System.out.println(Integer.parseInt((request.getParameter("UIN"))));
				entity1 = entity1dao.findByUIN(Integer.parseInt((request.getParameter("UIN"))));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(entity1.getName()!=null){
				request.setAttribute("entity1", entity1);
				request.getRequestDispatcher("/jsps/vaccination_card/update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "Entity not found");
				request.getRequestDispatcher("/jsps/vaccination_card/read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			vaccination_card form = new vaccination_card();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			form.setUIN(Integer.parseInt(request.getParameter("UIN")));
			form.setName(request.getParameter("name"));
			form.setFirst_dose(java.sql.Date.valueOf(request.getParameter("first_dose")));
			form.setSecond_date(java.sql.Date.valueOf(request.getParameter("second_date")));
			form.setBooster_date(Integer.parseInt(request.getParameter("booster_date")));
			form.setName_of_vaccine(request.getParameter("name_of_vaccine"));

			try {
				entity1dao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "vaccination_card Updated");
			request.getRequestDispatcher("/jsps/vaccination_card/read_output.jsp").forward(request, response);
		}
	}
}



