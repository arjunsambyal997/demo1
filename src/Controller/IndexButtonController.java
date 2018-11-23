package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Book;
import Model.Dao;
import Model.User;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/search")
public class IndexButtonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexButtonController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dao d = new Dao();
		String button = request.getParameter("b1");
		if(button.equals("Search"))
		{
		String bookname = request.getParameter("t0");
		List <Book> lst = d.selectBookForBorrow(bookname);
		request.setAttribute("lst", lst);
		RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
		rs.include(request, response);
		}
		else if(button.equals("Contact")) {
		int uid = Integer.parseInt(request.getParameter("t2")) ;
		User lst = d.getUserDetails(uid); 
	    request.setAttribute("lst", lst);
		RequestDispatcher view = request.getRequestDispatcher("indexContact.jsp");
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
