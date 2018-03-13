package com.example.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.Bean.Book;
import com.example.Bookstore.Bean.BookRepository;
import com.example.Bookstore.Bean.User;
import com.example.Bookstore.Bean.UserRepository;


@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository, UserRepository urepository) {
		return (args) -> {
			log.info("save a couple of books");
			repository.save(new Book("Ari Mennander", "Teemu", "9789511274353", 2014, 13.90));
			repository.save(new Book("Aki Linnanahde", "Jere", "9789510428450", 2017, 17.70));	
			
			urepository.save(new User("pyry", "$2a$04$AS/Lmw5B12wxU2v2wpZGEOADcpxdT3VnVeQ76wXj2DqgCE9yeqYkO", "USER"));
			urepository.save(new User("lauri", "$2a$04$Y/kwshiRLtXfOQftAHgrKefrKFeuWy2vrI/VZ5R37Ad5Lm3kpnqaK", "ADMIN"));
	
	
			
			log.info("fetch all book");
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
}
	
	
}