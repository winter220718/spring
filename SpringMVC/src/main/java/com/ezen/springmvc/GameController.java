package com.ezen.springmvc;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GameController {

	public GameController() {
		// TODO Auto-generated constructor stub
	}
	
//	@RequestMapping("/index")
//	String index() {
//		
//		return "game/index";
//	}
//	
//	// 닉넴 입력
//	@RequestMapping(value = "/enterName", method = RequestMethod.GET)
//	public String enterName() {
//		
//		return "game/enterName";
//	}
//	
//	// 확인 후 겜하러 가기
//	@RequestMapping(value = "/game", method = RequestMethod.GET)
//	public String game() {
//		
//		return "game/game";
//	}
//	
//	//쿠키 저장하기
//	@RequestMapping(value="/saveCookie", method=RequestMethod.POST)
//	public String saveCookie(HttpServletRequest request, HttpServletResponse response) {
//		
//		try {
//			request.setCharacterEncoding("UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		String user = request.getParameter("user");
//		Cookie cookie = new Cookie(user, "user");
//		cookie.setMaxAge(60*60*24*30);
//		response.addCookie(cookie);
//		
//		
//	    Cookie[] getCookie = request.getCookies(); // 모든 쿠키 가져오기
//	    if(getCookie != null){ // 만약 쿠키가 없으면 쿠키 생성
//	    	
//	        for(int i = 0; i < getCookie.length; i++){
//	            Cookie c = getCookie[i]; // 객체 생성
//	            String name = c.getName(); // 쿠키 이름 가져오기
//	            String value = c.getValue(); // 쿠키 값 가져오기
//	        }
//	    }
//		
//		
//		return "redirect:/game";
//	}
//	
//	
//	// 컴퓨터 선택 띄워 주기,
//	@RequestMapping(value="/computerPick")
//	public String computerPick(HttpServletRequest request, HttpServletResponse response) {
//		String[] rsp = {"가위","바위","보"};
//		
//		
//		
//		return rsp[(int)(Math.random() * rsp.length)];
//		
//		
//	}
//	
//	// 유저 선택
//	@RequestMapping(value="/userPick", method=RequestMethod.POST)
//	public String userPick(HttpServletRequest request, HttpServletResponse response) {
//		
//		try {
//			
//			request.setCharacterEncoding("UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		String pick = request.getParameter("rsp");
//		String[] rsp = {"가위","바위","보"};
//		
//		String computer_pick = rsp[(int)(Math.random() * rsp.length)];
//		
//		request.setAttribute("computer_pick", computer_pick);
//		request.setAttribute("pick", pick);
//		
//		
//		
//		return "redirect:/game";
//	}

	


}
