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
		// ���޵� POST parameter �Ľ�
		String value = "";
		String operator = "";
		String dot = "";
		
		// Cookie �Ľ� 
		String exp = "";
				
		if(operator!=null && operator.equals("=")) {
			// "=" �������� ��	-> ���
		} else {
			// ���ڿ��� add
		}
			
		// Cookie ���� �� �߰�
		
		// /calpage�� redirect
			
	}	

}
