package by.itacademi.library.entity;

public class Magazine extends PeriodicalEdition {
	private Articls[] articles;

	public Magazine() {
		super();
	}

	public Magazine(String title) {
		super(title);
	}

	public Articls[] getArticles() {
		return articles;
	}

	public void setArticles(Articls[] articles) {
		this.articles = articles;
	}

	public int countOfArticls() {
		return this.articles.length;
	}
	public Magazine(Articls[] articles) {
		super();
		this.articles = articles;
	}

	public String toString() {
		 String st=String.format("Type of Eqipment:Magazine  Title: %-20sCount of articls: %-5d",
				 this.getTitle(),
				 this.countOfArticls());
		return st;
	}

}
