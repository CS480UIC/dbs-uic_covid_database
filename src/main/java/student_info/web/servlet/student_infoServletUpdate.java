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

import student_info.dao.student_infoDao;
import student_info.domain.student_info;

/**
 * Servlet implementation class UserServlet
 */

public class student_infoServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public student_infoServletUpdate() {
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
		student_infoDao entity1dao = new student_infoDao();
		student_info entity1 = null;

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
				request.getRequestDispatcher("/jsps/student_info/update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "Entity not found");
				request.getRequestDispatcher("/jsps/student_info/read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			student_info form = new student_info();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}	
			form.setUin(Integer.parseInt(request.getParameter("uin")));
			form.setCrn(Integer.parseInt(request.getParameter("crn")));
			form.setRec_status( Integer.parseInt(request.getParameter("rec_status")));		
			form.setHousing_status(Integer.parseInt(request.getParameter("housing_status")));	
			form.setSymp_status(Integer.parseInt(request.getParameter("symp_status")));
			form.setQuarantine_start(java.sql.Date.valueOf(request.getParameter("quarantine_start")));
			form.setQuarantine_end(java.sql.Date.valueOf(request.getParameter("quarantine_end")));
			form.setLast_test_result(Integer.parseInt(request.getParameter("last_test_result")));
			form.setVaccine_status(Integer.parseInt(request.getParameter("vaccine_status")));
			form.setRecent_travel_status(Integer.parseInt(request.getParameter("recent_travel_status")));

			try {
				entity1dao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Student_info Updated");
			request.getRequestDispatcher("/jsps/student_info/read_output.jsp").forward(request, response);
		}
	}
}



