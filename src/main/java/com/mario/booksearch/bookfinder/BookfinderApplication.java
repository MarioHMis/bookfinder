package com.mario.booksearch.bookfinder;

import com.mario.booksearch.bookfinder.model.DataBook;
import com.mario.booksearch.bookfinder.service.DataConverter;
import com.mario.booksearch.bookfinder.service.GutendexApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookfinderApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BookfinderApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		var apiRequest = new GutendexApi();
		var json = apiRequest.getData("https://gutendex.com/books/");
		DataConverter converter = new DataConverter();
		var data = converter.getData(json, DataBook.class);
		System.out.println(data);
	}
}
