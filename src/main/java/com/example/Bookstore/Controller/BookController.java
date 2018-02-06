package com.example.Bookstore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Bookstore.Bean.BookRepository;

@Controller
public class BookController {
	@Autowired
	private BookRepository repository;
	
	@RequestMapping("/index")
	public String bStore(Model model){
		model.addAttribute("books",repository.findAll());
		return "booklist";
	}
}
