 package student_info.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student_info.domain.student_info;
import student_info.service.student_infoException;
import student_info.service.student_infoService;


/**
 * Servlet implementation class UserServlet
 */

public class student_infoServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public student_infoServletCreate() {
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
		student_infoService entity1service = new student_infoService();
		Map<String,String[]> paramMap = request.getParameterMap();
		student_info form = new student_info();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setUin( Integer.parseInt(info.get(0)));
		form.setCrn(Integer.parseInt( info.get(1)));
		form.setRec_status( Integer.parseInt( info.get(2)));		
		form.setHousing_status(Integer.parseInt( info.get(3)));	
		form.setSymp_status(Integer.parseInt(info.get(4)));
		form.setQuarantine_start(java.sql.Date.valueOf(info.get(5)));
		form.setQuarantine_end(java.sql.Date.valueOf(info.get(6)));
		form.setLast_test_result(Integer.parseInt(info.get(7)));
		form.setVaccine_status(Integer.parseInt(info.get(8)));
		form.setRecent_travel_status(Integer.parseInt(info.get(9)));
		
		try {
			entity1service.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | student_infoException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
