package by.itacademi.library.run;

import by.itacademi.library.entity.Author;
import by.itacademi.library.entity.Book;
import by.itacademi.library.entity.Library;
import by.itacademi.library.entity.PeriodicalEdition;

public class LibraryMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) { // в классе с методом main реализовать не менее 5-ти экземпл€ров каждого
												// скласса

		

		// Create test library
		Library myLibrary = new Library();
		myLibrary=myLibrary.getTestLibrary(5);
		myLibrary.showAll();
		System.out.println("----------------------------------------");
		
		// Count the number of book and magazine
		{
			System.out.println("Count the number of book:  " + myLibrary.countNumberOfBooks());
			System.out.println("Count the number of magazine:  " + myLibrary.countNumberOfMagazine());
			System.out.println("----------------------------------------");
		}
		
		// Search books by Author "Author4"
		{
			Author tempAuthor1 = new Author();
			tempAuthor1.setName("Author4");
			Book[] tempBooks = myLibrary.seachBookByAuthor(tempAuthor1);
			System.out.println("Author4 books");
			Book.showAll(tempBooks);			
			System.out.println("----------------------------------------");
		}

		// Sort by Title
		{
			System.out.println("Sort by title: ");
			PeriodicalEdition[] tempPeriodicalEditions = myLibrary.sortEditionsByTitle();
			PeriodicalEdition.showAll(tempPeriodicalEditions);
		}
	}

}
