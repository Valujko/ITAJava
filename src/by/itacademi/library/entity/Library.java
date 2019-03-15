package by.itacademi.library.entity;

import java.util.Arrays;
import java.util.Date;

public class Library {
	private PeriodicalEdition[] editions;
	private int index;

	// ¬ классе библеотека реализовать методы:
	// 1.добавление нового печатного издани€
	// 2. вывод на экран списка всех печатных изданий с подробной информацией о
	// каждом

	public Library() {
		super();
		this.editions = new PeriodicalEdition[1];
		this.index = 0;
	}

	public PeriodicalEdition[] getEditions() {
		return editions;
	}

	public void setEditions(PeriodicalEdition[] editions) {
		this.editions = editions;
	}

	public int countNumberOfBooks() {
		int countOfBooks=0;
		for (PeriodicalEdition pe:editions)
			if (pe.getClass().getSimpleName().equals("Book"))
				countOfBooks++;				
		return countOfBooks;
		

	}

	public int countNumberOfMagazine() {
		int countOfMagazine=0;
		for (PeriodicalEdition pe:editions)
			if (pe.getClass().getSimpleName().equals("Magazine"))
				countOfMagazine++;				
		return countOfMagazine;

	}

	public PeriodicalEdition[] sortEditionsByTitle() {
		 boolean isSorted = false;
	        PeriodicalEdition buf;
	        PeriodicalEdition[] tempPE = Arrays.copyOf(this.editions, index);
	        
	        while(!isSorted) {
	            isSorted = true;
	            for (int i = 0; i < tempPE.length-1; i++) {
	                if((tempPE[i].getTitle().compareTo(tempPE[i+1].getTitle()))>0) {
	                    isSorted = false;
	 
	                    buf = tempPE[i];
	                    tempPE[i] = tempPE[i+1];
	                    tempPE[i+1] = buf;
	                }
	            }
	        }
		return tempPE;
	}

	public int countNumberOfArticles(Magazine magazine) {
		return magazine.countOfArticls();
	}

	public void addEdition(PeriodicalEdition edition) {
			this.editions=Arrays.copyOf(this.editions, this.index+1);
			this.editions[index++] = edition;
		

	}

	public void showAll() {
		for (PeriodicalEdition pe: editions)
			System.out.println(pe.toString());
		
	}
	public Library getTestLibrary(int size) {
		Library testLibrary = new Library();
		Book tempBook;
		Booklet tempBooklet;
		Magazine tempMagazine;
		Date tempDate;
		Articls tempArticls;
		Author tempAuthor;
		String tempContent;
		
		for (int i = 0; i < size; i++) {
			testLibrary.addEdition(new Book("Book" + i + 1, new Author("Author" + i), 10 + i * 100)); // version one

			tempBook = new Book("Book" + i); // version two
			tempBook.setAuthor(new Author("Author" + i));
			tempBook.setPages(i * 100);
			testLibrary.addEdition(tempBook);

			tempBooklet = new Booklet("Booklet" + i);
			tempBooklet.setTopic("Topic" + i);
			tempDate = new Date(i * 1000000000);
			tempBooklet.setDate(tempDate);
			testLibrary.addEdition(tempBooklet);
			
			Articls[] masArt= new Articls[i*5];
			for (int j=0;j<i*5;j++) {
				tempArticls=new Articls("content"+i, "author"+j);
				masArt[j]=tempArticls;
				
			}
			
			tempMagazine = new Magazine("Magazine" + i);
			tempMagazine.setArticles(masArt);
			testLibrary.addEdition(tempMagazine);

		}

		
		return testLibrary;
		
	}
	public Book[] seachBookByAuthor(Author author) {
		Book[] tempBooks=new Book[this.index];
		int bookIndex=0;
		for (int i=0;i<index;i++){
		if ((editions[i].getClass().getSimpleName().equals("Book")) && 
				(((Book) editions[i]).getAuthor().equals(author)))
			tempBooks[bookIndex++]=(Book)editions[i];
		}
		
		//Book[] rezultBook = Arrays.copyOf(tempBooks, bookIndex); //version one
		return Arrays.copyOf(tempBooks, bookIndex);				   //version two	
	}
}
