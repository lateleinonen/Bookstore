package com.example.Kirjakauppa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	@RequestMapping("/index")
	public String kKauppa(){
		return "booklist";
	}
}
