package pojo;

// private variables
// public getters/setters
// default constructor
// parametrized construction

// overide equals()
// overide hashcode()
// overide toString()

public class BookPojo {

	private int bookId;
	private String bookTitle;
	private String bookGenre;
	private String bookAuthor;
	private int bookCost;
	
	public BookPojo() {
		super();
	}

	public BookPojo(int bookId, String bookTitle, String bookGenre, String bookAuthor, int bookCost) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookGenre = bookGenre;
		this.bookAuthor = bookAuthor;
		this.bookCost = bookCost;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookCost() {
		return bookCost;
	}
	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}

	@Override
	public String toString() {
		return "BookPojo [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookGenre=" + bookGenre + ", bookAuthor="
				+ bookAuthor + ", bookCost=" + bookCost + "]";
	}
	
	
	
}
