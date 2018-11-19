package Controller;

import java.io.IOException;

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
 * Servlet implementation class AddBookController
 */
@WebServlet("/addbook")
public class AddBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    /* Stores the entered book details in the database and forwards to 
     * Home Page
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String button = request.getParameter("b1");
		Book b;
		Dao db = new Dao();
		if(button.equals("AddBook"))
		{
			String bookname=request.getParameter("b");
			String author=request.getParameter("a");
			String genre=request.getParameter("g");
			
			b = new Book () ;
			b.setName(bookname);
			b.setAuthor(author);
			b.setGenre(genre);
			Boolean flag = db.insertBook(b);
			if(flag)
			{
				RequestDispatcher view = request.getRequestDispatcher("view.jsp");
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
