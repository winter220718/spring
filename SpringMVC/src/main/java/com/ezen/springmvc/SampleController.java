package com.ezen.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.springmvc.model.Employee;

//서블릿이 아니다 서블릿에서 이쪽으로 매핑해주는 대상이다
@Controller
public class SampleController {

	// 로포제2
	private static Logger log = LogManager.getLogger(SampleController.class);
	
	@RequestMapping(value={"/sample"}, method= {RequestMethod.GET, RequestMethod.POST})
	public String index() {
		
		return "sample/index"; // /WEB-INF/views/ 아래의 경로를 리턴해야한다
				
	}
	
	@GetMapping(value = {"/sample/get"})
	public String get() {
		return "sample/form";
				
	}
	
	@PostMapping("/sample/post")
	public String post(HttpServletRequest request) {
		log.info(request.getParameter("employee_id"));
		log.info(request.getParameter("first_name"));
		log.info(request.getParameter("last_name"));
	
		
		return "sample/result";
	}

	@PostMapping("/sample/post2")
	public String post2(Employee emp) {
		
//		log.info(emp);
		return "sample/result";
				
	}
	
	@PostMapping("/sample/post3")
	   public String post3(
	         @ModelAttribute("employee_id") Integer emp_id, 
	         @ModelAttribute("first_name") String f_name, 
	         @ModelAttribute("last_name") String l_name) {
	      
//	      log.info(emp_id);
//	      log.info(f_name);
//	      log.info(l_name);
	      
	      return "sample/result";
	   }
	
	@GetMapping("/sample/find/void")
	public void orange(Employee e) {
//		log.info(e);
		
		
	}
	
	
	
}

