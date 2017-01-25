package com.tioluwa.workdashboard.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tioluwa.workdashboard.server.WelcomeBeanRemote;

@SuppressWarnings("serial")
@WebServlet("/")
public class WelcomeServlet extends HttpServlet {
	
	@EJB
	WelcomeBeanRemote welcome;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>" + welcome.sayHello() + "</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
