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
@WebServlet(name = "register", urlPatterns = { "/register" })

public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }
 	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    /* Stores the entered user and contact details in the database and 
     * forwards to Home Page of the user.
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User s;
		Dao db = new Dao();
		String button = request.getParameter("b1");	
		if(button.equals("Register"))
		{
					
			String name=request.getParameter("n");
			String username=request.getParameter("u");
			String email=request.getParameter("e");
			String phone=request.getParameter("ph");
			String password=request.getParameter("p");	
			String cpassword=request.getParameter("cp");
			if(password.equals(cpassword))
			{
							
				s = new User () ;
				s.setEmail(email);
				s.setPhone(phone);
				s.setName(name);
				s.setPassword(password);
				s.setUserName(username);
				Boolean flag = db.insertContact(s);
				if(flag)
				{
					RequestDispatcher view = request.getRequestDispatcher("Home.jsp");
					view.forward(request, response);
				}
			}
			else
			{
				RequestDispatcher rs = request.getRequestDispatcher("SignUp.jsp");
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