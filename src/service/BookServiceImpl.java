package service;

import java.util.List;

import dao.BookDao;
import dao.BookDaoImpl;
import pojo.BookPojo;

public class BookServiceImpl implements BookService{

	BookDao bookDao;
	
	public BookServiceImpl() {
		this.bookDao = new BookDaoImpl();
	}

	@Override
	public BookPojo addBook(BookPojo bookPojo) {
		return this.bookDao.addBook(bookPojo);
	}

	@Override
	public BookPojo updateBook(BookPojo bookPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteBook(int bookId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BookPojo> getAllBooks() {
		return this.bookDao.getAllBooks();
	}

}
