package com.techcrack;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebFilter("/login")
public class FilterTheUsers extends HttpFilter implements Filter {
       
	/*
	 * Filtering the user name and password is valid 
	 *Here We Are Checking only the userName And pass Word Satisfy the Constraint
	 */
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//Fetching the username and password from the client request object
		String userName=request.getParameter("userName");
		String passWord=request.getParameter("passWord");
		
		
		/*Basic Constraint of username and password is.
		 * its Length must be greater than 8
		 * Here we checking if it satisfy then we move to the 
		 * forward of client request
		 */
		if(userName.length()>8&&passWord.length()>8)
			chain.doFilter(request, response);
		else {
			
			/*
			 * Redirecting our page due to incorrect of username or password
			 */
			((HttpServletResponse)response).sendRedirect("failLogIn.jsp");
		}
	}
}
