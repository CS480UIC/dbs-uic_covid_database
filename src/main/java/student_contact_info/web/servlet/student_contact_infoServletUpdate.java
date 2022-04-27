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

import student_contact_info.dao.student_contact_infoDao;
import student_contact_info.domain.student_contact_info;

/**
 * Servlet implementation class UserServlet
 */

public class student_contact_infoServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public student_contact_infoServletUpdate() {
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
		student_contact_infoDao entity1dao = new student_contact_infoDao();
		student_contact_info entity1 = null;

		if(method.equals("search"))
		{
			try {
				entity1 = entity1dao.findByUIN(Integer.parseInt((request.getParameter("uin"))));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}

			if(entity1.getUin()!=null){
				request.setAttribute("entity1", entity1);
				request.getRequestDispatcher("/jsps/student_contact_info/update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "student_contact_info not found");
				request.getRequestDispatcher("/jsps/student_contact_info/read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			student_contact_info form = new student_contact_info();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			

			form.setUin(Integer.parseInt(request.getParameter("uin")));
			form.setPhone_number( Integer.parseInt(request.getParameter("phone_number")));
			form.setEmail(request.getParameter("email"));		
			form.setEmergency_contact( Integer.parseInt(request.getParameter("emergency_contact")) );
			

			try {
				entity1dao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Entity Updated");
			request.getRequestDispatcher("/jsps/student_contact_info/read_output.jsp").forward(request, response);
		}
	}
}



