package com.example.Kirjakauppa.Bean;

public class Book {
	private String author;
	private String title;
	private String isbn;
	private long year;
	private double price;
	//testi
	public Book() {
		super();
		this.author = null;
		this.title = null;
		this.isbn = null;
		this.year = 0;
		this.price = 0;
	}

	public Book(String author, String title, String isbn, long year, double price) {
		super();
		this.author = author;
		this.title = title;
		this.isbn = isbn;
		this.year = year;
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
