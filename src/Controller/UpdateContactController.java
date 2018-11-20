package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Dao;
import Model.User;

/**
 * Servlet implementation class UpdateContactController
 */
@WebServlet("/UpdateContactController")
public class UpdateContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateContactController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User s;
		Dao db = new Dao();
		String button = request.getParameter("b1");	
		if(button.equals("Save"))
		{
					
			String name=request.getParameter("n");
			String email=request.getParameter("e");
			String phone=request.getParameter("ph");
			int cid=0; //user username to get contact id
			boolean flag1=db.updateContactName(cid, name);
			boolean flag2=db.updateContactEmail(cid, email);
			boolean flag3=db.updateContactPhone(cid, phone);
			if(flag1 && flag2 && flag3)
			{
				RequestDispatcher view = request.getRequestDispatcher("Home.jsp");
				view.forward(request, response);
			}
			else
			{
				RequestDispatcher view = request.getRequestDispatcher("UpdateContact.jsp");
				view.include(request, response);
			}
		}
		else if(button.equals("Cancel))
		{
			RequestDispatcher view = request.getRequestDispatcher("Home.jsp");
			view.forward(request, response);
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
