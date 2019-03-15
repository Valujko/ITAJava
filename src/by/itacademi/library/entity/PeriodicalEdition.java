package by.itacademi.library.entity;

public class PeriodicalEdition {
	private String title;
	
	public PeriodicalEdition(){
		this("Default");
		
	}
	public static void showAll(PeriodicalEdition[] t) {
		for (PeriodicalEdition p : t)
			System.out.println(p.toString());
	}
	
	public PeriodicalEdition(String title) {
	    super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void showEditorHomeAdress(){
		System.out.println("Periodical edition street");
	}
}
