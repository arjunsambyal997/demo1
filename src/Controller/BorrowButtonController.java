package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.*;

/**
 * Servlet implementation class BorrowButtonController
 */
@WebServlet("/borrowbutton")
public class BorrowButtonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BorrowButtonController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String button = request.getParameter("b1");
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("n");
		Dao db = new Dao();
		Book b;
			if(button.equals("SearchBook"))
			{
		
			String bookname = request.getParameter("t1");
			List <Book> lst = db.selectBookForBorrow(bookname);
			request.setAttribute("lst", lst);
			RequestDispatcher rs = request.getRequestDispatcher("Borrow.jsp");
			rs.include(request, response);
				
			} else if (button.equals("SearchUser")) {
				String name = request.getParameter("t1");
				int id = db.selectUser(name);
				List <Book> lst = db.selectAllBooksForBorrowByUser(id);
				request.setAttribute("lst", lst);
					RequestDispatcher view = request.getRequestDispatcher("Borrow.jsp");
					view.forward(request, response);
			
				
			}
			 else if (button.equals("Contact")) {
		int uid = Integer.parseInt(request.getParameter("t2")) ;
		
			User lst = db.getUserDetails(uid); 
		    request.setAttribute("lst", lst);
			RequestDispatcher view = request.getRequestDispatcher("Contact.jsp");
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
