package com.bookstore.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.bookstore.entities.Buyer;
import com.bookstore.service.BookStoreService;
import com.bookstore.service.BookStoreServiceImpl;

public class BookStoreTest {

	public static void main(String[] args) {
		System.out.println("Starting BOokstore App ************>>>>>>>>>>>>>>>><<<<<<<<<<<<<*************");
		// TODO Auto-generated method stub

		// STEP 1: Create some data
		// Create some buyers
		

		// STEP 2: Call your service class and pass the data
		System.out.println("START Operation1: getBuyersByDate");
		BookStoreService bookStoreSrvc = new BookStoreServiceImpl();
		
		List<Buyer> returnedBuyers = bookStoreSrvc.getBuyersByDate(new Date(System.currentTimeMillis()));

		//Loop Through on Returned Buyers and Print them
		for(Buyer eachBuyer: returnedBuyers) {
			System.out.println(eachBuyer.getName());
		}
		System.out.println("END: Operation1: getBuyersByDate");

		// STEP 3: Validate the Outputs
	}

}
