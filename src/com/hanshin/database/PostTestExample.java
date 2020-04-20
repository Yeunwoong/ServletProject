package com.hanshin.database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example2")
public class PostTestExample extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost ½ÇÇà µÊ");
		PrintWriter out = resp.getWriter();
		
		ServletInputStream input = req.getInputStream();
		int length = req.getContentLength();
		byte[] buf = new byte[length];
		input.readLine(buf, 0, length);
		String s = new String(buf);
		out.println(s);
		out.close();
	}
}