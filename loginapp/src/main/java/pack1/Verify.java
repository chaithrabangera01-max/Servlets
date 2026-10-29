package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/t")
public class Verify extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String uname=req.getParameter("username");
		String pass=req.getParameter("password");
		
		if ("admin".equals(uname) && "Admin@123".equals(pass)) {
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("home.html");
		requestDispatcher.forward(req, resp);
		}
		else {
			
			PrintWriter writer=resp.getWriter();
			writer.print("<h1>Please enter the valid username and password</h1>");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("login.html");
			requestDispatcher.include(req, resp);
	 
		}

}
}