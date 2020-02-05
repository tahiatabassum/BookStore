package com.bookstore.entities;

import java.util.Date;

public class Buyer {

	private String name;
	private String email;
	private String interests;
	private int quantity;
	private Date purchasedDate;
	
	

	public String getName() {
		return name;
	}
/**
 * @param name
 * @param email
 * @param interests
 * @param quantity
 * @param purchasedDate
 */
public Buyer(String name, String email, String interests, int quantity, Date purchasedDate) {
	super();
	this.name = name;
	this.email = email;
	this.interests = interests;
	this.quantity = quantity;
	this.purchasedDate = purchasedDate;
}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getPurchasedDate() {
		return purchasedDate;
	}

	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}

}
