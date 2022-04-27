package uic_classes.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import uic_classes.dao.uic_classesDao;
import uic_classes.domain.uic_classes;


/**
 * Servlet implementation class UserServlet
 */

public class uic_classesServletRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public uic_classesServletRead() {
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
		uic_classes entity1 = null;
		uic_classesDao entity1Dao = new uic_classesDao();
		
		try {
			entity1 = entity1Dao.findByUIN( Integer.parseInt( request.getParameter("uin_of_classes")));
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		}
		
		if(entity1.getUIN()!= null){
					System.out.println(entity1);
					request.setAttribute("entity1", entity1);
					request.getRequestDispatcher("/jsps/uic_classes/read_output.jsp").forward(request, response);
			}
			else{
			System.out.println(entity1.getCRN());
			request.setAttribute("msg", "Entity not found");
			request.getRequestDispatcher("/jsps/uic_classes/read_output.jsp").forward(request, response);
		}
	}
}



