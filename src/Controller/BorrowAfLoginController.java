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
 * Servlet implementation class BorrowAfLoginController
 */
@WebServlet("/BorrowAfLoginController")
public class BorrowAfLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BorrowAfLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String button = request.getParameter("b1");
		User s;
		Dao db = new Dao();
		
		if(button.equals("ContactInfo"))
		{
			//How to display contact info for a particular book?
		}
		else if(button.equals("SearchBook"))
		{
			String book=request.getParameter("t1");
			List <Book> b = db.selectBookByName(book);
			request.setAttribute("sb", b);
			RequestDispatcher view = request.getRequestDispatcher("DisplayBooks.jsp");
			view.forward(request, response);
		}
		else if(button.equals("SearchAuthor"))
		{
			String author=request.getParameter("t2");
			List <Book> b = db.selectBookByAuthor(author);
			request.setAttribute("sb", b);
			RequestDispatcher view = request.getRequestDispatcher("DisplayBooks.jsp");
			view.forward(request, response);
			
		}
		else
		{
			List <Book> b = db.selectAllBooksForBorrow();
			request.setAttribute("sb", b);
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
