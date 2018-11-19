package Model;
/* This class declares the fields in the Book Database.
 * Contains getter and setter methods for Book ID, Name, Author, 
 * Genre & Contact ID. 
 */
public class Book {
	private int bookId;
	private String name;	
	private String author;
	private String genre;
	private String issueStatus;
	private int userId;
	private String status ;
	
	public int getBookId() {  				//Returns book id value
		return bookId;
	}
	public void setBookId(int bookId) { 	//Sets book id of current object
		this.bookId = bookId;
	}
	public String getName() {  				//Returns book name 
		return name;
	}
	public void setName(String name) { 		//Sets book name of current object
		this.name = name;
	}
	public String getAuthor() {          	//Returns book author name
		return author;
	}
	public void setAuthor(String author) {	//Sets author name of current object
		this.author = author;
	}
	public String getGenre() {				//Returns genre of book
		return genre;
	}
	public void setGenre(String genre) {	//Sets genre of current object
		this.genre = genre;
	}
	public String getStatus() {				//Returns status of book
		return status;
	}
	public void setStatus(String status) {	//Sets status of current object
		this.status = status;
	}
	public String getIssueStatus() { // Returns issue status of book
		return issueStatus;
	}
	public void setIssueStatus(String issueStatus) { // Sets issue status of books
		this.issueStatus = issueStatus;
	}
	public int getUserId() {  // returns user id
		return userId;
	}
	public void setUserId(int userId) { // sets user id
		this.userId = userId;

	}

}
