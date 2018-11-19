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

/**
 * Servlet implementation class DeleteBookController
 */
@WebServlet("/deletebook")
public class DeleteBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBookController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    /* Selects book with entered id from the database and deletes it from the
     * same to make it unavailable on the borrower list.
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String button = request.getParameter("b1");
		Book b;
		Dao db = new Dao();
		if(button.equals("DeleteBook")) 
		{	
			int id=Integer.parseInt(request.getParameter("b"));
			String name=request.getParameter("i");
			boolean flag = db.deleteBook(id);
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
