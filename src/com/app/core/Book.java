package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4129189611948207037L;
	private String title;
	private Category type;
	private double price;
	private LocalDate publishDate;
	private String authorName;
	private int quantity;
	
	public Book(String title, Category type, double price, LocalDate publishDate, String authorName, int quantity) {
		super();
		this.title = title;
		this.type = type;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", type=" + type + ", price=" + price + ", publishDate=" + publishDate
				+ ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}
	
	public LocalDate getPublishDate() {
		return publishDate;
	}

	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Category getType() {
		return this.type;
	}

	public String getTitle() {
		return title;
	}

}
