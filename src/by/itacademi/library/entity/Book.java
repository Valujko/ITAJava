package by.itacademi.library.entity;

public class Book extends PeriodicalEdition {
	private Author author;
	private int pages;

	public Book() {
		super();
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author=author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Book(String title) {
		super(title);
	}

	
	public Book(String title,Author author, int pages) {
		super(title);
		this.author = author;
		this.pages = pages;
	}

	public String toString() {
		String st=String.format("Type of Eqipment:Book      Title: %-20sAuthor: %-20sPages: %-4d",
								this.getTitle(),
								this.getAuthor().getName(),
								this.getPages());
		return st; 
	}

	public void showAuthorsInfo() {
		System.out.println("no authors");
	}

	
}
