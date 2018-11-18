package Model;
/* This class declares the fields in the Borrower Database.
 * Contains getter and setter methods for Borrower ID & Book ID. 
 */
public class Borrower extends User {
	private int borrowerId;
	private int bookId;
	

	public int getBorrowerId() {  				//Returns borrower id of user
		return borrowerId;
	}
	public void setBorrowerId(int borrowerId) { // Sets borrower id of current user
		this.borrowerId = borrowerId;
	}
	public int getBookId() {					//Returns book id of borrowed book
		return bookId;
	}
	public void setBookId(int bookId) {			//Sets book id of borrowed book
		this.bookId = bookId;
	}
	

}
