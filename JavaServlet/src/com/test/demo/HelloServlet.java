package com.test.demo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		out.print("Hello Servlet test");
		
	}
}
