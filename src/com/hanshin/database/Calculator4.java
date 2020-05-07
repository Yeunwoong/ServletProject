package com.hanshin.database;

import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cal4")
public class Calculator4 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 전달된 POST parameter 파싱
		String value = "";
		String operator = "";
		String dot = "";
		
		// Cookie 파싱 
		String exp = "";
				
		if(operator!=null && operator.equals("=")) {
			// "=" 연산자일 때	-> 계산
		} else {
			// 문자열에 add
		}
			
		// Cookie 생성 및 추가
		
		// /calpage로 redirect
			
	}	

}
