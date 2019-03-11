package by.itacademi.library.entity;

public class Author {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author(String name) {
		super();
		this.name = name;
	}

	public boolean equals(Author author) {
		if (this.name.equals(author.name)) return true;
		return false;
	}
	public Author() {
		
	
	}
	
}
