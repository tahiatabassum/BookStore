package com.bookstore.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.bookstore.entities.Book;
import com.bookstore.entities.Buyer;
import com.bookstore.utility.DummyData;

public class BookStoreServiceImpl implements BookStoreService{

	@Override
	public List<Buyer> getBuyersByDate(Date dt) {
		
		//GET Day of Date
		Date date; // your date
		// Choose time zone in which you want to interpret your Date
		Calendar cal1 = Calendar.getInstance(TimeZone.getDefault());
		cal1.setTime(dt);
		int dayOfMyDate = cal1.get(Calendar.DAY_OF_MONTH);
		
		
		
		List<Buyer> returningTheseBuyers = new ArrayList<Buyer>();
		// TODO Auto-generated method stub
		//Get buyers from database
		List<Buyer> buyers = DummyData.getBuyers();
		//filter the buyers
		for(Buyer eachBuyer : buyers) {
			Date buyerDate = eachBuyer.getPurchasedDate();
			Calendar cal2 = Calendar.getInstance(TimeZone.getDefault());
			cal2.setTime(buyerDate);
			int dayOfCurrentDate = cal2.get(Calendar.DAY_OF_MONTH);
			
			if(dayOfMyDate == dayOfCurrentDate) {
				returningTheseBuyers.add(eachBuyer);
			}
		}
		//return the filtered buyers
		return returningTheseBuyers;
	}

	@Override
	public Book addABook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> getTotalBooks() {
		return null;
	}
	
}
