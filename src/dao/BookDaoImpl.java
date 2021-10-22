package dao;

import java.util.ArrayList;
import java.util.List;

import pojo.BookPojo;

public class BookDaoImpl implements BookDao{

	List<BookPojo> allBooksStore;
	
	public BookDaoImpl() {
		this.allBooksStore = new ArrayList<BookPojo>();
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		bookPojo.setBookId(allBooksStore.size() + 1);
		allBooksStore.add(bookPojo);
		return bookPojo;
	}

	//later
	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	
	//later
	@Override
	public boolean deleteBook(int bookId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BookPojo> getAllBooks() {
		return allBooksStore;
	}

	

}
