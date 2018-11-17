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
@WebServlet("/register")
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User s;
		Dao db = new Dao();
				
				String name = request.getParameter("t1");
				String email = request.getParameter("t2");
				String phone =request.getParameter("t3");					
				s = new User () ;
				s.setEmail(email);
				s.setPhone(phone);
				s.setName(name);
				Boolean flag = db.insertContact(s);
				if(flag)
				{
					RequestDispatcher view = request.getRequestDispatcher("view.jsp");
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