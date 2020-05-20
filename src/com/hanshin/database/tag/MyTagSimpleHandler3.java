package com.hanshin.database.tag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTagSimpleHandler3 extends SimpleTagSupport {
	private int num1;
	private int num2;	
	public int getNum1() {
		return num1;
	}	
	public int getNum2() {
		return num2;
	}	
	public void setNum1(int num1) {
		this.num1 = num1;
	}	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println("클래스 기반 커스텀 태그 출력 메시지 - Hello3: ");
		out.print(num1 + "+" + num2 + "=" + (num1+num2));	
	}
}
