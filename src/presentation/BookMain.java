package presentation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.BookDao;
import pojo.BookPojo;
import service.BookService;
import service.BookServiceImpl;

public class BookMain {

	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();
		
		Scanner scan = new Scanner(System.in);
		int option = 0;
		String ch = "y";
		
		while("y".equals(ch)) {
			System.out.println("**********************************");
			System.out.println("WELCOME TO BOOK MANAGEMENT SYSTEM");
			System.out.println("**********************************");
			System.out.println("1. Add a Book.");
			System.out.println("2. Update a Book.");
			System.out.println("3. Remove a Book.");
			System.out.println("4. List all Books.");
			System.out.println("5. Exit.");
			System.out.println("**********************************");
			System.out.println("Enter your option:");
			option = Integer.parseInt(scan.nextLine());
			System.out.println("**********************************");
			
			switch(option) {
			case 1:
				BookPojo bookPojo = new BookPojo();
				System.out.println("Enter book title:");
				bookPojo.setBookTitle(scan.nextLine());
				
				System.out.println("Enter book genre:");
				bookPojo.setBookGenre(scan.nextLine());
				
				System.out.println("Enter book author:");
				bookPojo.setBookAuthor(scan.nextLine());
				
				System.out.println("Enter book cost:");
				bookPojo.setBookCost(Integer.parseInt(scan.nextLine()));
				
				BookPojo returnedBookPojo = bookService.addBook(bookPojo);
				System.out.println("Book added successfully!!");
				System.out.println("New book ID is : " + returnedBookPojo.getBookId());
				break;
				
			case 2:
				System.out.println("update book");
				break;
			case 3:
				System.out.println("remove book");
				break;
			case 4:
				List<BookPojo> allBooks = bookService.getAllBooks();
				System.out.println(allBooks.size());
				System.out.println(allBooks);
				
				System.out.println("ID\tTITLE\t\tGENRE\t\tAUTHOR\t\tCOST");
//				Iterator<BookPojo> itr = allBooks.iterator();
//				while(itr.hasNext()) {
//					BookPojo myBookPojo = itr.next();
//					System.out.println(myBookPojo);
//					System.out.print(myBookPojo.getBookId() + "\t" + myBookPojo.getBookTitle() + "\t\t" + myBookPojo.getBookGenre() + "\t\t" + myBookPojo.getBookAuthor() + "\t\t" + myBookPojo.getBookCost());					
//				}
//				System.out.println();
				
				allBooks.forEach((myBookPojo) -> {
					System.out.print(myBookPojo.getBookId() + "\t" + myBookPojo.getBookTitle() + "\t\t" + myBookPojo.getBookGenre() + "\t\t" + myBookPojo.getBookAuthor() + "\t\t" + myBookPojo.getBookCost());
					System.out.println();
				});
				System.out.println();
				
				break;
			case 5:
				System.out.println("Thank you for using the app!!");
				System.out.println("Exiting the application....");
				System.out.println("**********************************");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter a valid option");
				continue;
			}
			
			System.out.println("**********************************");
			System.out.println("Do you want to continue? (y/n) :");
			ch = scan.nextLine();
			
			if("y".equalsIgnoreCase(ch)) {
				continue;
			} else {
				System.out.println("**********************************");
				System.out.println("Thank you for using the app!!");
				System.out.println("Exiting the application....");
				System.out.println("**********************************");
				System.exit(0);
			}
			
		}
		
		
		
	}

}
