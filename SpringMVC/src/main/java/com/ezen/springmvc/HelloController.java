package com.ezen.springmvc;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.springmvc.model.Book;

@RequestMapping("/hello")
@Controller
public class HelloController {

	
	// sysout ��� Log4j�� �α� ���
	
	// 1. Logger ����
	
	//Log4j
//	private static Logger log = Logger.getLogger(HelloController.class);
	
	//Log4j2
	private static org.apache.logging.log4j.Logger log2 
		= org.apache.logging.log4j.LogManager.getLogger(HelloController.class); // �⺻�� �� Ŭ������ �ش�
	
	@Autowired
	Book b2, b3;
	@Autowired
	Book b4;

//	@RequestMapping("/log")
//	String log() {
//		// 2. sysout ��� ���ϴ� �α׸� Logger�� �߰��ϱ� (�α׸��� ��� ���� ����)
//		log.fatal("Fatal level log message.");
//		log.error("Error level log message.");
//		log.warn("Warn level log message.");
//		log.info("Info level log message.");
//		log.debug("Debug level log message.");
//		log.trace("Trace level log message.");
//		
//		return "hello/index";
//		
//	}
	
	@RequestMapping("/log2")
	String log2() {
		
		log2.fatal("Fatal level log message.");
		log2.error("Error level log message.");
		log2.warn("Warn level log message.");
		log2.info("Info level log message.");
		log2.debug("Debug level log message.");
		log2.trace("Trace level log message.");
		
		return "hello/index";
	}

	@RequestMapping("/index")
	String index() {
		
		
		b2.setAuthor("���طѸ�");
		System.out.println(b2.getAuthor());
		
		return "hello/index";
	}
}
