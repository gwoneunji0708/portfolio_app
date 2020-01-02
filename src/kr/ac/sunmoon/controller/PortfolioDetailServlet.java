package kr.ac.sunmoon.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.sunmoon.model.service.PortfolioService;


@WebServlet("/portfoliodetail.do")
public class PortfolioDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PortfolioService pService = new PortfolioService();
		try {
			Int no = request.getParameter("no");
			
		} catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
			request.getRequestDispatcher("error.jsp").forward(request, response);
			
		}
		
		
		
	}

}
