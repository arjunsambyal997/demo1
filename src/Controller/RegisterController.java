package Controller;
 import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;

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
		Boolean flag;
		Dao db = new Dao();
		String button = request.getParameter("b1");	
		PrintWriter out = response.getWriter();
		String pass = null;
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
				   try {
					MessageDigest md = MessageDigest.getInstance("MD5");
					    md.update(password.getBytes());
					    byte[] digest = md.digest();
					    pass = DatatypeConverter.printHexBinary(digest).toUpperCase();
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				s.setPassword(pass);
				s.setUserName(username);
				User u = db.getUserDetails(s.getUserName());
				if (u != null) {
				flag = db.insertUser(s);
				}else {
					flag = false ;
				}
				int uid = db.selectUser(s.getUserName());
				s.setId(uid);
				if(flag)
					flag = db.insertContact(s);
					
				if(flag)
				{
					response.sendRedirect("Login.jsp");
				}else {
					response.sendRedirect("SignUp.jsp");
				}
			}
			else
			{
				response.sendRedirect("SignUp.jsp");
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