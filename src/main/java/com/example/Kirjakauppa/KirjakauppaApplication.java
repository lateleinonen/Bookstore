package com.example.Kirjakauppa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Kirjakauppa.Bean.BookRepository;
import com.example.Kirjakauppa.Bean.Book;


@SpringBootApplication
public class KirjakauppaApplication {

	private static final Logger log = LoggerFactory.getLogger(KirjakauppaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(KirjakauppaApplication.class, args);
	}
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository) {
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book("Ari Mennander", "Teemu", "9789511274353", 2014, 13.90));
			repository.save(new Book("Aki Linnanahde", "Jere", "9789510428450", 2017, 17.70));	
			
			log.info("fetch all book");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
}
}