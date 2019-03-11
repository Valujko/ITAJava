package by.itacademi.library.entity;

public class Articls {
	private String content;
	private String author;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Articls() {
		super();
	}

	public Articls(String content, String author) {
		super();
		this.content = content;
		this.author = author;
	}

}
