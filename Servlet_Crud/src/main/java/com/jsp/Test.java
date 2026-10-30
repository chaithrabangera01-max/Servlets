package com.jsp;

import java.io.IOException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/t")
public class Test extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String clg = req.getParameter("clg");

		Student s = new Student();
		s.setName(name);
		s.setId(age);
		s.setClg(clg);
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jsp");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	et.begin();
	em.persist(s);
	et.commit();
	}

}
