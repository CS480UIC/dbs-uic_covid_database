package student_contact_info.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student_contact_info.domain.student_contact_info;
import student_contact_info.service.student_contact_infoException;
import student_contact_info.service.student_contact_infoService;


/**
 * Servlet implementation class UserServlet
 */

public class student_contact_infoServletCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public student_contact_infoServletCreate() {
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
		student_contact_infoService entity1service = new student_contact_infoService();
		Map<String,String[]> paramMap = request.getParameterMap();
		student_contact_info form = new student_contact_info();
		List<String> info = new ArrayList<String>();

		for(String name : paramMap.keySet()) {
			String[] values = paramMap.get(name);
			info.add(values[0]);
		}
		form.setUin(Integer.parseInt(info.get(0)) );
		form.setPhone_number( Integer.parseInt(info.get(1)) );
		form.setEmail(info.get(2));		
		form.setEmergency_contact( Integer.parseInt(info.get(3)) );
		
		try {
			entity1service.create(form);
			response.sendRedirect( request.getContextPath() + "/jsps/main.jsp");
			
		} catch (ClassNotFoundException | student_contact_infoException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		
	}

}
