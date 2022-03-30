package com.books.Monitoring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.Monitoring.entities.BookEntity;
import com.books.Monitoring.respositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository repository;
	
	public List<BookEntity> findAllBooks(){
		return repository.findAll();
	}
	public BookEntity findBookById(Long id){
		return repository.findById(id).get();
	}
	public void saveBook(BookEntity entity) {
		repository.save(entity);
	}
	public BookEntity findExistBook(Long chave, Double value) {
		BookEntity book =repository.findExist(chave,value); 
		if(book!=null) {
			return book;
		}else {			
			return null;
		}
	}

	public List<BookEntity> findByInterval(Integer interval) {
		List<BookEntity> list = new ArrayList<>();
		BookEntity firstBook = repository.findById(1L).get();
		list.add(firstBook);
		firstBook = repository.findByInterval(firstBook.getChave_book()+interval);
		while(firstBook!=null){
			list.add(firstBook);
		}
		return list;
	}
	
}
