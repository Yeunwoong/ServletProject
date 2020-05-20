package com.hanshin.database.tag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTagSimpleHandler2 extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println("Ŭ���� ��� Ŀ���� �±� ��� �޽��� - Hello2");
		
		JspFragment body = this.getJspBody();
		StringWriter sw = new StringWriter();
		body.invoke(sw);
		String str = sw.toString();
		out.print(str.toUpperCase());		
	}
}
