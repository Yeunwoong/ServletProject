package com.hanshin.database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>get</title></head>");
		out.print("<body>");
		out.print("<h1>GET ������� ��û�Ǿ����ϴ�</h1>");

		String id = req.getParameter("id");
		String password = req.getParameter("pwd");
		String name = req.getParameter("name");
		String[] depts = req.getParameterValues("dept");
		String gender = req.getParameter("gender");
		String birth = req.getParameter("birth");
		String intro = req.getParameter("introduction");

		out.print("ID : " + id + "<br/>");
		out.print("��й�ȣ : " + password + "<br/>");
		out.print("�̸� : " + name + "<br/>");
		out.print("�к� : ");
		for (int i = 0; i < depts.length; i++) {
			out.print(depts[i] + " ");
		}
		out.print("<br/>");
		out.print("���� : " + gender + "<br/>");
		out.print("birth : " + birth + "<br/>");
		out.print("�Ұ� : " + intro + "<br/>");
		out.print("��ü Query ���ڿ� : " + req.getQueryString());

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

		String id = req.getParameter("id");
		String password = req.getParameter("pwd");
		String name = req.getParameter("name");
		String[] depts = req.getParameterValues("dept");
		String gender = req.getParameter("gender");
		String birth = req.getParameter("birth");
		String intro = req.getParameter("introduction");

		out.print("ID : " + id + "<br/>");
		out.print("��й�ȣ : " + password + "<br/>");
		out.print("�̸� : " + name + "<br/>");
		out.print("��� : ");
		for (int i = 0; i < depts.length; i++) {
			out.print(depts[i] + " ");
		}
		out.print("<br/>");
		out.print("���� : " + gender + "<br/>");
		out.print("���� : " + birth + "<br/>");
		out.print("�Ұ� : " + intro + "<br/>");
		out.print("��ü Query ���ڿ� : " + req.getQueryString());
		
		out.println("</body></html>");
		out.close();
	}
}
