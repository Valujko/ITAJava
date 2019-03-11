package by.itacademi.library.entity;

import java.util.Date;

public class Booklet extends PeriodicalEdition {
	private Date date; // создать Брошюра, дата выпуска, тема, набор заметок
	private String topic; // реализовать 5 конструкторов для брошюры
	private Articls[] articls;

	public Booklet(Date date, String topic, Articls[] articls) {
		super();
		this.date = date;
		this.topic = topic;
		this.articls = articls;
	}

	public Booklet() {
		super();
	}

	public Booklet(Date date, String topic) {
		super();
		this.date = date;
		this.topic = topic;
	}

	public Booklet(Date date) {
		super();
		this.date = date;
	}

	public Booklet(String title) {
		super(title);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Articls[] getArticls() {
		return articls;
	}

	public void setArticls(Articls[] articls) {
		this.articls = articls;
	}
	
	
	public String toString() {
		String st = String.format("Type of Eqipment:Booklet   Title: %-20sTopic: %-20s Date:%tF", 
				this.getTitle(),
				this.getTopic(),
				this.getDate());
		return st;
	}
}
