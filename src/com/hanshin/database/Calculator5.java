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

@WebServlet("/cal5")
public class Calculator5 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String value = req.getParameter("value");
		String operator = req.getParameter("operator");
		String dot = req.getParameter("dot");
		
		String exp = "";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
			for(Cookie c : cookies) {
				if(c.getName().equals("exp")) {
					exp = c.getValue();
					break;
				}			
			}
		}
		
		if(operator!=null && operator.equals("=")) {
			//ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
			ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
			try {
				exp = String.valueOf(engine.eval(exp));
			} catch (ScriptException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
		else if(operator!=null && operator.equals("C")) {
			// exp = ""; 빈 문자열이 감
		}
		else {
			exp += (value == null)?"":value;
			exp += (operator == null)?"":operator;
			exp += (dot == null)?"":dot;
		}
			
		
		Cookie expCookie = new Cookie("exp", exp);
		if(operator!=null && operator.equals("C"))
			expCookie.setMaxAge(0);
		resp.addCookie(expCookie);
		resp.sendRedirect("/calpage");
			
	}	

}
