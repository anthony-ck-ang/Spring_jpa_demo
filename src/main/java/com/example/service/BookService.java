package com.example.service;

import java.util.List;

import com.example.domain.Book;

public interface BookService {
	//public Iterable<Book> findAll();
	public List<Book> findAll();
	
	public void saveBook(Book book);
	public Book findOne(long id);
	public void delete(long id);
	
	//public Iterable<Book> findByName(String name);
	public List<Book> findByName(String name);
	
	public List<Book> findByNameAndAuthor(String name, String author);
	public List<Book> findByPrice(long price);
}