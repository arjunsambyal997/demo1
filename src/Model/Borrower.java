package Model;
/* This class declares the fields in the Borrower Database.
 * Contains getter and setter methods for Borrower ID & Book ID. 
 */
public class Borrower extends User {
	private int borrowid;
	private int bookId;
	

	public int getBorrowId() { // returns book owner's id
		return borrowid;
	}
	public void setBorrowId(int borrowerId) { // Sets Owner's id
		this.borrowid = borrowerId;

	}
	public int getBookId() {					//Returns book id of borrowed book
		return bookId;
	}
	public void setBookId(int bookId) {			//Sets book id of borrowed book
		this.bookId = bookId;
	}
	

}