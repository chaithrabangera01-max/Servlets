package pack1;

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/d")
public class sample extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String clgName=req.getParameter("clgName");
		
		
		PrintWriter writer=resp.getWriter();
		writer.print("<html><body>");
		writer.print("<h1>Name:"+name+"</h1>");
		writer.print("<h1>Name:"+email+"</h1>");
		writer.print("<h1>Name:"+clgName+"</h1>");
		
		
	}
	
	
	
}
