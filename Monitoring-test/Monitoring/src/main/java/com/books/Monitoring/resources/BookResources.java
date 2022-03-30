package com.books.Monitoring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.books.Monitoring.entities.BookEntity;
import com.books.Monitoring.services.BookService;

@RestController
@RequestMapping(value="/book")
public class BookResources {
	@Autowired
	private BookService service;
	
	@GetMapping
	public ResponseEntity<List<BookEntity>> consult(@RequestParam("interval")Integer interval){
		return ResponseEntity.ok().body(service.findByInterval(interval));
	}
	
	@GetMapping(value="/all")
	public ResponseEntity<List<BookEntity>> findAll(){
		return ResponseEntity.ok().body(service.findAllBooks());
	}
	@GetMapping(value="/teste")
	public ResponseEntity<List<BookEntity>> teste() throws Exception{
		return ResponseEntity.ok().body(getListBooksFromMercadoBitcoin());
	}
	/*public void teste(){
		List<BookEntity> listBook = getListBooksFromMercadoBitcoin();
		for(BookEntity book:listBook) {
			if(service.findExistBook(book.getChave_book(),book.getValue_book())==null) {
				service.saveBook(book);
			}
		}
	}*/
	public List<BookEntity> getListBooksFromMercadoBitcoin() throws Exception{
		String url="https://www.mercadobitcoin.net/api/BTC/orderbook";
		//HttpClient client = HttpClientBuilder.create().build();    
	    //HttpResponse response = client.execute(new HttpGet(url));
	    //HttpEntity entity = response.getEntity();
	    //String responseString = EntityUtils.toString(entity);
	    //BookEntity jsonResp = new Gson().fromJson(responseString, BookEntity.class);
	    RestTemplate rest = new RestTemplate();
		BookEntity[] books = rest.getForObject(url, BookEntity[].class);
		return null;
	}
}
