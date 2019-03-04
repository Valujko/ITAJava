package by.itacademi.pvt3.cl;

public class SportEqiupment {
	private Categori categori;
	private String title;
	private int price;

	public SportEqiupment(String title, String categoriName, int categoriPart,
			int price) {
		Categori temp = new Categori(categoriName, categoriPart);
		this.categori = temp;
		this.title = title;
		this.price = price;
	}

	public String toString() {
		return this.title + " " + this.categori.name;

	}

	public SportEqiupment getByName(String name) {

		return null;

	}
}
