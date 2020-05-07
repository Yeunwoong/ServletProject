package com.hanshin.database;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cal2")
public class Calculator2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		// data parsing
		int v = 0;
		String op = "";

		// 계산
		if(op.equals("=")) {
			
			int result = 0;
			resp.getWriter().printf("result is %d\n", result);
			
			}			
		else{
			// 값을 저장						
		}	
		
	}	

}
