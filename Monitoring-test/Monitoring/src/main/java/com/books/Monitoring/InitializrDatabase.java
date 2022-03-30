package com.books.Monitoring;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.books.Monitoring.entities.BookEntity;
import com.books.Monitoring.services.BookService;

@Service
//public class InitializrDatabase implements ApplicationRunner{
public class InitializrDatabase{
	/*@Autowired
	private BookService service;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<BookEntity> listBook = getListBooksFromMercadoBitcoin();
		for(BookEntity book:listBook) {
			if(service.findExistBook(book.getChave_book(),book.getValue_book())==null) {
				service.saveBook(book);
			}
		}
	}
	public List<BookEntity> getListBooksFromMercadoBitcoin(){
		String url="http://www.mercadobitcoin.net/api/BTC/orderbook";
		RestTemplate rest = new RestTemplate();
		BookEntity[] books = rest.getForObject(url, BookEntity[].class);
		return Arrays.asList(books);
	}*/
}
