package com.bookstore.utility;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.bookstore.entities.Buyer;

public class DummyData {

	public static List<Buyer> getBuyers(){
		List<Buyer> buyers = new ArrayList<Buyer>();
		buyers.add(new Buyer("James","j@gmail.com", "Horror", 2, new GregorianCalendar(2019, Calendar.NOVEMBER, 02).getTime()));
		buyers.add(new Buyer("Sarah","s@gmail.com", "Comedy", 3, new GregorianCalendar(2019, Calendar.NOVEMBER, 04).getTime()));
		return buyers;
	}
}
