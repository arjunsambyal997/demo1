package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.User;
import Model.Dao;

/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String button = request.getParameter("b1");
		User s;
		Dao db = new Dao();
			if(button.equals("Insert"))
			{
				String name=request.getParameter("t2");
				String password=request.getParameter("t3");			
				s = new User () ;
				s.setName(name);
				s.setPassword(password);
				Boolean flag = db.insertUser(s);
				if(flag)
				{
					RequestDispatcher view = request.getRequestDispatcher("view.jsp");
					view.forward(request, response);
				}
				
			} else if (button.equals("Update")) {
				
				int id=Integer.parseInt(request.getParameter("t1"));
				String name = request.getParameter("t2");
				String password = request.getParameter("t3");
				s = new User ();

				boolean flag = db.updateUserName(id , name);
				flag = db.updateUserPassword(id , password);
				
				if(flag)
				{
					RequestDispatcher view = request.getRequestDispatcher("view.jsp");
					view.forward(request, response);
				}
				
			} else if (button.equals("Delete")) {
				
				int id=Integer.parseInt(request.getParameter("t1"));
				boolean flag = db.deleteUser(id);
				if(flag)
				{
					RequestDispatcher view = request.getRequestDispatcher("view.jsp");
					view.forward(request, response);
				}
				
			} else if (button.equals("Select")) {
				int id=Integer.parseInt(request.getParameter("t1"));			
				List <User> s1 =  db.selectUser(id);
				request.setAttribute("st", s1);
				RequestDispatcher view = request.getRequestDispatcher("view1.jsp");
				view.forward(request, response);
				
			} else if (button.equals("SelectAll")) {
			
				List <User> s1 =  db.selectAllUsers();
				request.setAttribute("st", s1);
				RequestDispatcher view = request.getRequestDispatcher("view1.jsp");
				view.forward(request, response);
				
			}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
