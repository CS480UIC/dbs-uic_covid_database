package student_contact_info.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student_contact_info.dao.student_contact_infoDao;
import student_contact_info.domain.student_contact_info;


/**
 * Servlet implementation class UserServlet
 */

public class student_contact_infoServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public student_contact_infoServletRead() {
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
		student_contact_info form = null;
		student_contact_infoDao entity1Dao = new student_contact_infoDao();
		
		try {
			form = entity1Dao.findByUIN(Integer.parseInt(request.getParameter("uin"))); 
//			System.out.println("UIN from form inside try " + form.getUin());
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
//		System.out.println("UIN from form outside try" + form.getUin());
		
		if(form.getUin()!= null){
//					System.out.println("here " + form);
					request.setAttribute("entity1", form);
//					System.out.println("here2 ");
					request.getRequestDispatcher("/jsps/student_contact_info/read_output.jsp").forward(request, response);
//					System.out.println("here3 ");
			}
			else{
			request.setAttribute("msg", "Entity not found");
			request.getRequestDispatcher("/jsps/student_contact_info/read_output.jsp").forward(request, response);
		}
	}
}



