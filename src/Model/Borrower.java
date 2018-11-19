package Model;

public class Borrower extends User {
	private int ownerId;
	private int bookId;
	

	public int getOwnerId() {
		return ownerId;
	}
	public void setBorrowerId(int borrowerId) {
		this.ownerId = borrowerId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	

}
