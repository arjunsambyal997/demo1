package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.User;
import Model.Dao;

/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sql;
		String button = request.getParameter("b1");
		User s;
		Dao db = new Dao();
			if(button.equals("Insert"))
			{
				sql = "Insert into student2 values(?,?)";
				int id=Integer.parseInt(request.getParameter("t1"));
				String password=request.getParameter("t2");			
				s = new User (id,password) ;		
				Boolean flag = db.insert(sql,s);
				if(flag)
				{
					RequestDispatcher view = request.getRequestDispatcher("view.jsp");
					view.forward(request, response);
				}
				
			} else if (button.equals("Update")) {
				sql = "Update student2 set password=? where id=?";
				int id=Integer.parseInt(request.getParameter("t1"));
				String password = request.getParameter("t2");
				s = new User ();
				s.setPassword(password);
				s.setId(id);
				boolean flag = db.update(sql, s);
				if(flag)
				{
					RequestDispatcher view = request.getRequestDispatcher("view.jsp");
					view.forward(request, response);
				}
				
			} else if (button.equals("Delete")) {
				sql = "Delete from student2 where id=?";
				int id=Integer.parseInt(request.getParameter("t1"));
				boolean flag = db.delete(sql, id);
				if(flag)
				{
					RequestDispatcher view = request.getRequestDispatcher("view.jsp");
					view.forward(request, response);
				}
				
			} else if (button.equals("Select")) {
				int id=Integer.parseInt(request.getParameter("t1"));
				sql="Select * from student2 where id=?";
				List <User> s1 =  db.select(sql,id);
				request.setAttribute("st", s1);
				RequestDispatcher view = request.getRequestDispatcher("view1.jsp");
				view.forward(request, response);
				
			} else if (button.equals("SelectAll")) {
				sql="Select * from student2";
				List <User> s1 =  db.selectAll(sql);
				request.setAttribute("st", s1);
				RequestDispatcher view = request.getRequestDispatcher("view1.jsp");
				view.forward(request, response);
				
			}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
