package by.itacademi.library.run;

import java.util.Date;

import by.itacademi.library.entity.Articls;
import by.itacademi.library.entity.Author;
import by.itacademi.library.entity.Book;
import by.itacademi.library.entity.Booklet;
import by.itacademi.library.entity.Library;
import by.itacademi.library.entity.Magazine;
import by.itacademi.library.entity.PeriodicalEdition;

public class LibraryMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) { // в классе с методом main реализовать не менее 5-ти экземпл€ров каждого
												// скласса

		Library myLibrary = new Library();
		Book tempBook;
		Booklet tempBooklet;
		Magazine tempMagazine;
		Date tempDate;
		Articls tempArticls;
		Author tempAuthor;
		String tempContent;

		// Create test library
		for (int i = 0; i < 5; i++) {
			myLibrary.addEdition(new Book("Book" + i + 1, new Author("Author" + i), 10 + i * 100)); // version one

			tempBook = new Book("Book" + i); // version two
			tempBook.setAuthor(new Author("Author" + i));
			tempBook.setPages(i * 100);
			myLibrary.addEdition(tempBook);

			tempBooklet = new Booklet("Booklet" + i);
			tempBooklet.setTopic("Topic" + i);
			tempDate = new Date(i * 1000000000);
			tempBooklet.setDate(tempDate);
			myLibrary.addEdition(tempBooklet);

			Articls[] masArt= new Articls[i*5];
			for (int j=0;j<i*5;j++) {
				tempArticls=new Articls("content"+i, "author"+j);
				masArt[j]=tempArticls;
				
			}
			
			tempMagazine = new Magazine("Magazine" + i);
			tempMagazine.setArticles(masArt);
			myLibrary.addEdition(tempMagazine);

		}

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
			for (Book b : tempBooks)
				System.out.println(b.toString());
			System.out.println("----------------------------------------");
		}

		// Sort by Title
		{
			System.out.println("Sort by title: ");
			PeriodicalEdition[] tempPeriodicalEditions = myLibrary.sortEditionsByTitle();
			for (PeriodicalEdition p : tempPeriodicalEditions)
				System.out.println(p.toString());
		}
	}

}
