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
//	// �г� �Է�
//	@RequestMapping(value = "/enterName", method = RequestMethod.GET)
//	public String enterName() {
//		
//		return "game/enterName";
//	}
//	
//	// Ȯ�� �� ���Ϸ� ����
//	@RequestMapping(value = "/game", method = RequestMethod.GET)
//	public String game() {
//		
//		return "game/game";
//	}
//	
//	//��Ű �����ϱ�
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
//	    Cookie[] getCookie = request.getCookies(); // ��� ��Ű ��������
//	    if(getCookie != null){ // ���� ��Ű�� ������ ��Ű ����
//	    	
//	        for(int i = 0; i < getCookie.length; i++){
//	            Cookie c = getCookie[i]; // ��ü ����
//	            String name = c.getName(); // ��Ű �̸� ��������
//	            String value = c.getValue(); // ��Ű �� ��������
//	        }
//	    }
//		
//		
//		return "redirect:/game";
//	}
//	
//	
//	// ��ǻ�� ���� ��� �ֱ�,
//	@RequestMapping(value="/computerPick")
//	public String computerPick(HttpServletRequest request, HttpServletResponse response) {
//		String[] rsp = {"����","����","��"};
//		
//		
//		
//		return rsp[(int)(Math.random() * rsp.length)];
//		
//		
//	}
//	
//	// ���� ����
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
//		String[] rsp = {"����","����","��"};
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
