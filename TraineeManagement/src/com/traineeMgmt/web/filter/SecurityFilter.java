package com.traineeMgmt.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.traineeMgmt.model.persistance.user.User;

@WebFilter(urlPatterns = "*.do")
public class SecurityFilter implements Filter {

   
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		//if ur are not logged in i will not allow you
		boolean isLoggedIn=false;
		
		
		
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		
		HttpSession httpSession=req.getSession(false);
		if(httpSession!=null) {
			User user=(User) httpSession.getAttribute("user");
			if(user!=null) {
				isLoggedIn=true;
			}
		}
		if(isLoggedIn) {
		chain.doFilter(request, response);
		}else {
			res.sendRedirect("Login.html?status=please do login");
			return ;
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}