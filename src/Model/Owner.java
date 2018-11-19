package Model;
/* This class declares the fields in the Owner Database.
 * Contains getter and setter methods for Book ID & Owner ID. 
 */
public class Owner extends User {
	private int ownerId;
	private int bookId;
	
	public int getOwnerId() {				//Returns owner id of user	
		return ownerId;
	}
	public void setOwnerId(int ownerId) {	//Sets owner id of user
		this.ownerId = ownerId;
	}
	public int getBookId() {				//Returns book id of added book
		return bookId;
	}
	public void setBookId(int bookId) {		//Sets book id of added book
		this.bookId = bookId;
	}

}
