package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Book;
import com.example.repository.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService{
	
	private BookRepository bookRepository;
	
	@Autowired
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	//private BookOwnRepository bookOwnRepository;
	
	public void saveBook(Book book){
		bookRepository.save(book);
	}
	public Book findOne(long id){
		return bookRepository.findOne(id);
	}
	public void delete(long id){
		bookRepository.delete(id);
	}
	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}
	@Override
	public List<Book>findByName(String name) {
		return bookRepository.findByName(name);
	}
	@Override
	public List<Book> findByNameAndAuthor(String name, String author) {
		return bookRepository.findByNameAndAuthor(name, author);
	}
	@Override
	public List<Book> findByPrice(long price) {
		return bookRepository.findByPrice(price);
	}

}
