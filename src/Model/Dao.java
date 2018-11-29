package Model;
import java.io.Console;
/*This class handles all the methods called in the Controller classes
 * for execution of functions connected to database.
 * Creates connection to the database.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Dao {

	private String url = "jdbc:mysql://localhost:3306/Book_list";
	private String user = "root";
	private String pass = "";
	String sql;
	
	
	public boolean insertUser(User s) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "INSERT INTO `User` (`username`, `password`) VALUES (?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s.getUserName());
			ps.setString(2, s.getPassword());
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result = false;
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean insertContact(User s) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "INSERT INTO `Contact`(`contactid`,`name`, `email`, `phone`) VALUES (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			ps.setString(3, s.getEmail());
			ps.setString(4, s.getPhone());
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result = false;
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean insertBorrower(Borrower b) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "INSERT INTO `Borrower`(`borrowid`, `bookid`, `ownerid`) VALUES (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, b.getBorrowId());
			ps.setInt(2, b.getBookId());
			ps.setInt(3, b.getId());
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result = false;
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean insertBookStatus(Book b) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "INSERT INTO `BookStatus`(`bid`, `status`) VALUES (?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, b.getBookId());
			ps.setString(2, b.getIssueStatus());
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result = false;
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean insertBook(Book b) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "INSERT INTO `Book`( `name`, `author`, `genre`, `state` ,`userid`) VALUES (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, b.getName());
			ps.setString(2, b.getAuthor());
			ps.setString(3, b.getGenre());
			ps.setString(4, b.getStatus());
			ps.setInt(5, b.getUserId());
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result = false;
			e.printStackTrace();
		}
		return result;
	}


	public boolean updateUserPassword(int id , String password) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "UPDATE `User` SET `password`=? WHERE uid=?";
			PreparedStatement ps = con.prepareStatement(sql);			
			ps.setString(1, password);
			ps.setInt(2, id);			
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}

	public boolean updateUserName(int id , String username) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "UPDATE `User` SET `username`=? WHERE uid = ?";
			PreparedStatement ps = con.prepareStatement(sql);			
			ps.setString(1, username);
			ps.setInt(2, id);			
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}

	public boolean updateContactName(int contactId , String name) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "UPDATE `Contact` SET `name`= ? WHERE `contactid`=?";
			PreparedStatement ps = con.prepareStatement(sql);			
			ps.setString(1, name);
			ps.setInt(2, contactId);			
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public boolean updateContactPhone(int contactId , String phone) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "UPDATE `Contact` SET `phone`= ? WHERE `contactid`=?";
			PreparedStatement ps = con.prepareStatement(sql);			
			ps.setString(1, phone);
			ps.setInt(2, contactId);		
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public boolean updateContactEmail(int contactId , String email) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "UPDATE `Contact` SET `email`= ? WHERE `contactid`=?";
			PreparedStatement ps = con.prepareStatement(sql);			
			ps.setString(1, email);
			ps.setInt(2, contactId);
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public boolean updateBookIssueStatus(int bookId , String issueStatus) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "UPDATE `BookStatus` SET `status`= ? WHERE `bid`=?";
			PreparedStatement ps = con.prepareStatement(sql);			
			ps.setString(1, issueStatus);
			ps.setInt(2, bookId);
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public boolean updateBookName(int bookId , String name) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "UPDATE `Book` SET `name`= ? WHERE `bookid`=?";
			PreparedStatement ps = con.prepareStatement(sql);			
			ps.setString(1, name);
			ps.setInt(2, bookId);
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public boolean updateBookAuthor(int bookId , String author) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "UPDATE `Book` SET `author`=? WHERE `bookid`=?";
			PreparedStatement ps = con.prepareStatement(sql);			
			ps.setString(1, author);
			ps.setInt(2, bookId);
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	

	public boolean updateBookGenre(int bookId , String genre) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "UPDATE `Book` SET `genre`=? WHERE `bookid`=?";
			PreparedStatement ps = con.prepareStatement(sql);			
			ps.setString(1, genre);
			ps.setInt(2, bookId);
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public boolean updateBookStatus(int bookId , String status) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "UPDATE `Book` SET `state`=? WHERE `bookid`=?";
			PreparedStatement ps = con.prepareStatement(sql);			
			ps.setString(1, status);
			ps.setInt(2, bookId);
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public boolean deleteUser(int uid) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "Delete from User where uid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, uid);
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public boolean deleteContact(int contactId) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "DELETE FROM `Contact` WHERE contactid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, contactId);
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}

	public boolean deleteBook(int bookId) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "DELETE FROM `BookStatus` WHERE bid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bookId);
			ps.executeUpdate();
			sql = "DELETE FROM `Borrower` WHERE bookid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, bookId);
			ps.executeUpdate();
			sql = "DELETE FROM `Book` WHERE bookid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, bookId);
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}


	public boolean deleteBorrower(int borrowId) {
		boolean result = true ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql = "DELETE FROM `Book` WHERE bookid=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, borrowId);
			ps.executeUpdate();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public int selectUser(String username) {
		int id = -1;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="Select `uid`,`username` from User where username = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1 , username);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				id = rs.getInt(1);		
			}

			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;


	}
	
	public int selectBookId(String bookname ,int uid) {
		int id = -1;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="Select `bookid` from Book where name = ? and userid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1 , bookname);
			ps.setInt(2 , uid);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				id = rs.getInt(1);		
			}

			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;


	}
	
	public String getStatus(int bookid) {
		String status = "";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="SELECT  `status` FROM `BookStatus` WHERE bid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bookid);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
			status = rs.getString(1);	
				
			}

			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}
	
	//returns name,email and phone for a user by id
	public User getUserDetails(int id) {
		User u = new User();
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="Select `username`, `name`, `email`, `phone` from User Inner Join Contact where User.uid = Contact.contactid and uid= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				u.setId(id);
				u.setUserName(rs.getString(1));
				u.setName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPhone(rs.getString(4));		
				
			}

			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;


	}
	
	//returns uid,name,email and phone for a user by username
	public User getUserDetails(String username) {
		User u = new User();
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="Select `uid`, `name`, `email`, `phone` from User Inner Join Contact where User.uid = Contact.contactid and username=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				u.setId(rs.getInt(1));
				u.setUserName(username);
				u.setName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPhone(rs.getString(4));	
				
			}

			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;


	}

	// returns all the users in database with contact info
	public List <User> selectAllUsers() {
		List <User> lst = new ArrayList<>();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="Select `uid`, `username`, `name`, `email`, `phone` from User Inner Join Contact where User.uid = Contact.contactid";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
		
			while(rs.next()) {
				User u = new User();
				u.setId(rs.getInt(1));
				u.setUserName(rs.getString(2));
				u.setName(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setPhone(rs.getString(5));		
				lst.add(u);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;

	}
	
	//searches for a book in book table and returns its status as well
	public List<Book> selectBookByName(String bookname) {
	 List <Book> lst = new ArrayList<Book>();
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="Select `name`, `author`, `genre`, `state` ,`bookid`,`status`,`userid` from Book Inner Join BookStatus on Book.bookid = BookStatus.bid AND name = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bookname);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				Book b = new Book();
				b.setName(rs.getString(1));
				b.setAuthor(rs.getString(2));
				b.setGenre(rs.getString(3));
				b.setStatus(rs.getString(4));
				b.setBookId(rs.getInt(5));
				b.setIssueStatus(rs.getString(6));
				b.setUserId(rs.getInt(7));
				lst.add(b);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;


	
}
//searches for a book in book table using author and returns its status as well
	public List <Book> selectBookByAuthor(String author , int uid) {
		List <Book> lst = new ArrayList<>();
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="Select `name`, `author`, `genre`, `state` , `status` ,`bookid` from Book Inner Join BookStatus where Book.bookid = BookStatus.bid and userid = ? and  author = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, uid);
			ps.setString(2, author);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				Book b = new Book();
				b.setName(rs.getString(1));
				b.setAuthor(rs.getString(2));
				b.setGenre(rs.getString(3));
				b.setStatus(rs.getString(4));
				b.setIssueStatus(rs.getString(5));
				lst.add(b);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;


	}
	
	//returns all the book's owned by a user using username
	public List <Book> selectAllBooksByUser(String name) {
		List <Book> lst = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="SELECT `name`, `author`, `genre`, `state` ,`userid` ,`status`,`bookid` "+
			"FROM (( Book INNER JOIN User ON User.uid = Book.userid And User.username =?)"
					+ " Inner Join BookStatus On Book.bookid = BookStatus.bid)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
		
			while(rs.next()) {
				Book b = new Book();
				b.setName(rs.getString(1));
				b.setAuthor(rs.getString(2));
				b.setGenre(rs.getString(3));
				b.setStatus(rs.getString(4));
				b.setUserId(rs.getInt(5));
				b.setIssueStatus(rs.getString(6));
				b.setBookId(rs.getInt(7));
				lst.add(b);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;

	}
	
	//selects all the books owned by user using userid
	public List <Book> selectAllBooksByUser(int uid) {
		List <Book> lst = new ArrayList<>();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="SELECT `name`, `author`, `genre`, `state` FROM Book INNER JOIN User ON User.uid = Book.userid And User.uid =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();
		
			while(rs.next()) {
				Book b = new Book();
				b.setName(rs.getString(1));
				b.setAuthor(rs.getString(2));
				b.setGenre(rs.getString(3));
				b.setStatus(rs.getString(4));
				lst.add(b);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;

	}
	
	//checks for a specific book by bookname of a specific user  by username
	public List <Book> searchBookOfUser(String bookname , String username) {
		List <Book> lst = new ArrayList<>();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="SELECT  `name`, `author`, `genre`, `state`,`bookid` FROM Book INNER JOIN User ON User.uid = Book.userid And (Book.name =? OR Book.author = ? OR Book.genre = ?) And User.username= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bookname);
			ps.setString(2, bookname);
			ps.setString(3, bookname);
			ps.setString(4, username);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Book b = new Book();
				b.setName(rs.getString(1));
				b.setAuthor(rs.getString(2));
				b.setGenre(rs.getString(3));
				b.setStatus(rs.getString(4));				
				b.setBookId(rs.getInt(5));
				lst.add(b);
			}
				con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;

	}
	
	// returns all the books that can be borrowed
	public List <Book> selectAllBooksForBorrow() {
		List <Book> lst = new ArrayList<>();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="SELECT `name`, `author`, `genre`, `state` , `userid`,`status` FROM Book INNER JOIN BookStatus ON BookStatus.bid = Book.bookid And BookStatus.status = \"available\" ";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();		
			while(rs.next()) {
				Book b = new Book();
				b.setName(rs.getString(1));
				b.setAuthor(rs.getString(2));
				b.setGenre(rs.getString(3));
				b.setStatus(rs.getString(4));
				b.setUserId(rs.getInt(5));
				lst.add(b);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;

	}
	
	public List <Book> selectAllBooksForBorrowByUser(int id) {
		List <Book> lst = new ArrayList<>();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="SELECT `name`, `author`, `genre`, `state` , `userid`,`status` FROM Book INNER JOIN BookStatus ON BookStatus.bid = Book.bookid And BookStatus.status = \"available\" and Book.userid =? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();		
			while(rs.next()) {
				Book b = new Book();
				b.setName(rs.getString(1));
				b.setAuthor(rs.getString(2));
				b.setGenre(rs.getString(3));
				b.setStatus(rs.getString(4));
				b.setUserId(rs.getInt(5));
				b.setIssueStatus(rs.getString(6));
				lst.add(b);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;

	}
	
	
	//checks for a specific book available for borrow 
	public List <Book> selectBookForBorrow(String bookname) {
		List <Book> lst = new ArrayList<>();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="SELECT `name`, `author`, `genre`, `state` ,`userid` FROM Book INNER JOIN BookStatus ON BookStatus.bid = Book.bookid And BookStatus.status = \"available\" And Book.name = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bookname);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Book b = new Book();
				b.setName(rs.getString(1));
				b.setAuthor(rs.getString(2));
				b.setGenre(rs.getString(3));
				b.setStatus(rs.getString(4));
				b.setUserId(rs.getInt(5));
				lst.add(b);
			}				
				con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;

	}
	
	
	//returns all the books borrowed by user by userid
	public List <Book> selectAllBooksBorrowed(int uid) {
		List <Book> lst = new ArrayList<>();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			sql="SELECT `name`, `author`, `genre`, `state` FROM Book INNER JOIN Borrower ON Borrower.bookid = Book.bookid And Borrower.borrowid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();		
			while(rs.next()) {
				Book b = new Book();
				b.setName(rs.getString(1));
				b.setAuthor(rs.getString(2));
				b.setGenre(rs.getString(3));
				b.setStatus(rs.getString(4));
				lst.add(b);
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;

	}
	
	
	
	public boolean checkUser(String username,String password) 
    {
     boolean st =false;
     try{

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        sql = "select * from User where username=? and password=?";
        PreparedStatement ps =con.prepareStatement (sql);
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs =ps.executeQuery();
        st = rs.next();
        con.close();
     }catch(Exception e)
     {
         e.printStackTrace();
     }
        return st;                 
 }   

}
