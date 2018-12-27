package fsgSortants.servlets;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fsgSortants.db.DBInsertion;

/**
 * Servlet implementation class ContactAction
 */
@WebServlet("/ContactAction")
public class ContactAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int tel = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//this.getServletContext().getRequestDispatcher("/WEB-INF/pages/test.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tels = request.getParameter("tel") ;
		if(tels != null) {
			 tel = Integer.parseInt(tels);
		}
			
		
			
		String mail = request.getParameter("mail");
		String nom = request.getParameter("nom");
		String message = request.getParameter("message");
		DBInsertion.insertVisiteur(tel, mail, nom, message);
		response.sendRedirect("http://localhost:8080/fsgSortants/home");
		doGet(request, response);
	}

}
