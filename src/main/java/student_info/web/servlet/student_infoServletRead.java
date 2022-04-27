package student_info.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student_info.dao.student_infoDao;
import student_info.domain.student_info;


/**
 * Servlet implementation class UserServlet
 */

public class student_infoServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public student_infoServletRead() {
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
		student_info entity1 = null;
		student_infoDao entity1Dao = new student_infoDao();
		
		try {
			entity1 = entity1Dao.findByUIN(Integer.parseInt(request.getParameter("uin")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(entity1.getUin()!=null){
					System.out.println(entity1);
					request.setAttribute("entity1", entity1);
					request.getRequestDispatcher("/jsps/student_info/read_output.jsp").forward(request, response);
			}
			else{
			request.setAttribute("msg", "Entity not found");
			request.getRequestDispatcher("/jsps/student_info/read_output.jsp").forward(request, response);
		}
	}
}



