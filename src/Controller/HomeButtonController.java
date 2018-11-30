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
 * Servlet implementation class HomeButtonController
 */
@WebServlet("/homebutton")
public class HomeButtonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeButtonController() {
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
		boolean flag = true;
			if(button.equals("Search"))
			{
				String search = request.getParameter("t1");
				 int uid = db.selectUser(username);
				List <Book> lst = db.searchBookOfUser(search, username);
				
					
				 for(Book obj : lst)
				 {
					 int bookid =obj.getBookId();
						String issueStatus = db.getStatus(bookid); 
						obj.setIssueStatus(issueStatus);
				 }
				request.setAttribute("sb", lst);
				 
				RequestDispatcher rs = request.getRequestDispatcher("Home.jsp");
				rs.include(request, response);

			
				
			} else if (button.equals("Add Book")) {
				
				String name = request.getParameter("t1");
				String author = request.getParameter("t2");
				String genre = request.getParameter("t3");
				String status = request.getParameter("t4");
				String issueStatus = request.getParameter("t5");
				int uid = db.selectUser(username);
				
				
				
				 b = new Book();
				 b.setUserId(uid);
				 b.setName(name);
				 b.setAuthor(author);
				 b.setGenre(genre);
				 b.setStatus(status);
				 b.setIssueStatus(issueStatus);
				 flag = db.insertBook(b);
				 int bookid = db.selectBookId(name,uid);
				 b.setBookId(bookid);
				 
				 if(issueStatus.equals("Lent")) {
						String borrower = request.getParameter("t6");
					int borrowid = db.selectUser(borrower);
					Borrower br =new Borrower();
					br.setBorrowId(borrowid);
					br.setId(uid);
					br.setBookId(bookid);
					if(flag)
					flag = db.insertBorrower(br);
					
					}
				 
				 if(flag)
					 flag = db.insertBookStatus(b);
				if(flag)
				{
					response.sendRedirect("home");
				}
				
			}
			 else if (button.equals("Remove")) {
					
				 String bookname = request.getParameter("t1");
				 int uid = db.selectUser(username);
				 int bookId = db.selectBookId(bookname,uid);
					flag = db.deleteBook(bookId);
					
					if(flag)
					{
						response.sendRedirect("home");
					}
					
				}
			 else if (button.equals("Update")) {
					
				 String bookname = request.getParameter("t1");
					String author = request.getParameter("t2");
					String genre = request.getParameter("t3");
					String status = request.getParameter("t4");
					String issueStatus = request.getParameter("t5");
				 int uid = db.selectUser(username);
				 int bookId = Integer.parseInt(request.getParameter("t0"));
			
				 if(flag )
					flag = db.updateBookName(bookId, bookname);
				 if(flag)
					 flag = db.updateBookAuthor(bookId, author);
				 if(flag)
					 flag = db.updateBookGenre(bookId, genre);
				 if(flag)
					 flag = db.updateBookStatus(bookId, status);
				 if(flag)
					 flag = db.updateBookIssueStatus(bookId, issueStatus);
					if(flag)
					{
						response.sendRedirect("home");
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
