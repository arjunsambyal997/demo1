package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Dao;
import Model.User;

/**
 * Servlet implementation class ContactButtonController
 */
@WebServlet("/contactbutton")
public class ContactButtonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactButtonController() {
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
		boolean flag = true ;
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("n");
		
		if(button.equals("Update"))
		{
					
			String name=request.getParameter("n");
			String email=request.getParameter("e");
			String phone=request.getParameter("ph");
			int cid= db.selectUser(username); 
			if(flag)
			 flag=db.updateContactName(cid, name);
			if(flag)
			flag=db.updateContactEmail(cid, email);
			if(flag)
			flag=db.updateContactPhone(cid, phone);
			if(flag)
			{
				RequestDispatcher view = request.getRequestDispatcher("contact");
				view.forward(request, response);
			}
		
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
