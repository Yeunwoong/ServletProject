package com.hanshin.database;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/queryTest3")
public class QueryTest3Servlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query ���ڿ� �׽�Ʈ</title></head>");
		out.print("<body>");
		out.print("<h1>GET ������� ��û�Ǿ����ϴ�</h1>");

		String name = req.getParameter("name");
		System.out.println(name);
		out.print("�̸� : " + name + "<br/>");

		out.println("</body></html>");
		out.close();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query ���ڿ� �׽�Ʈ</title></head>");
		out.print("<body>");
		out.print("<h1>POST ������� ��û�Ǿ����ϴ�</h1>");

		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		out.print("�̸� : " + name + "<br/>");

		out.println("</body></html>");
		out.close();
	}
}
