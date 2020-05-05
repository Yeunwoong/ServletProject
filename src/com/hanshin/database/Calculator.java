package com.hanshin.database;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal")
public class Calculator extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		int x = Integer.parseInt(req.getParameter("x"));
		int y = Integer.parseInt(req.getParameter("y"));		
		String operator = req.getParameter("operator");
		System.out.print(operator);
		int result = 0;
		if(operator.equals("µ¡¼À"))
			result = x + y;
		else if (operator.equals("»¬¼À"))
			result = x-y;
		
		resp.getWriter().printf("result is %d\n", result);
	}	

}
