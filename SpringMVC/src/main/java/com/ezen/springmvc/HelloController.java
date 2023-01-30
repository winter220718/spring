package com.ezen.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.springmvc.model.Book;


@RequestMapping("/hello")
@Controller
public class HelloController {

	@Autowired
	Book b2, b3;
	@Autowired
	Book b4;

	@RequestMapping("/index")
	String index() {

		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		b2.setAuthor("Á¶¾Ø·Ñ¸µ");
		System.out.println(b2.getAuthor());
		
		return "hello/index";
	}
} 