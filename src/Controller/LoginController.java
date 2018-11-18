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
 * Servlet implementation class RegisterController
 */
@WebServlet(name = "login", urlPatterns = { "/login" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }
 	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    /* Checks if the user name and password match from the database 
     * and forwards to Home Page
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dao db = new Dao();
		String button = request.getParameter("b1");	
			
		if(button.equals("Login"))
		{
			String username=request.getParameter("u");
			String password=request.getParameter("p");
			if(db.checkUser(username, password))
	        {
	            RequestDispatcher rs = request.getRequestDispatcher("Home.jsp");
	            rs.forward(request, response);
	        }
	        else
	        {
	 
	           RequestDispatcher rs = request.getRequestDispatcher("Login.jsp");
	           rs.include(request, response);
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