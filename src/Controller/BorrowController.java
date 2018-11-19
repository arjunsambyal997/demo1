package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Dao;
import Model.User;

/**
 * Servlet implementation class BorrowController
 */
@WebServlet("/BorrowController")
public class BorrowController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BorrowController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    /* Searches for books w.r.t to book name or author name and displays
     * a table of list of books.
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String button = request.getParameter("b1");
		User s;
		Dao db = new Dao();
		if(button.equals("SearchBook"))
		{
			String book=request.getParameter("t1");
			List <Book> b1 = db.searchBook(book);
			request.setAttribute("bo", b1);
				RequestDispatcher view = request.getRequestDispatcher("view.jsp");
				view.forward(request, response);
		}
		else if(button.equals("SearchAuthor"))
		{
			String author=request.getParameter("t2");
			List <Book> b1 = db.searchBookA(author);
			request.setAttribute("bo", b1);
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
