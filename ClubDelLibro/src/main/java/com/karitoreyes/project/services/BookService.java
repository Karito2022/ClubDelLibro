package com.karitoreyes.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karitoreyes.project.models.Book;
import com.karitoreyes.project.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
    private BookRepository bookRepo;
	
	public List<Book> getAllBooks(){
		List<Book> books = bookRepo.findAll();
		return books;
	}
	
	public Optional<Book> findBookById(Long id){
		Optional<Book> potentialBook = bookRepo.findById(id);
		return potentialBook;
		
	}
	
	public void saveBook(Book book){
		bookRepo.save(book);	
	}
	
	public void deleteBookById(Long id){
		bookRepo.deleteById(id);
	}
}