package com;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Add")
public class Add extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int a=Integer.parseInt(request.getParameter("no1"));
		int b=Integer.parseInt(request.getParameter("no2"));
		int c=a+b;
		PrintWriter out=response.getWriter();
		out.print(c);
	
	}

}
