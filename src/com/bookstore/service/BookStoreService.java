package com.bookstore.service;

import java.util.Date;
import java.util.List;

import com.bookstore.entities.*;

public interface BookStoreService {

	List<Buyer> getBuyersByDate(Date dt);

	Book addABook(Book book);
}
