package com.traineeMgmt.web.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.traineeMgmt.model.exception.UserNotFoundException;
import com.traineeMgmt.model.persistance.user.User;
import com.traineeMgmt.model.service.UserService;
import com.traineeMgmt.model.service.UserServiceImpl;

@WebServlet("/loginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {}

    private UserService userService= new UserServiceImpl();
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username=request.getParameter("uname");
		String password=request.getParameter("psw");
		
		Optional<User>optUser= userService.getUser(username, password);
		User user=null;
		try{
			user= optUser.orElseThrow(()-> new UserNotFoundException("user not found"));
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("user", user);
			response.sendRedirect("traineeController.do?action=showall");
			
		}catch(UserNotFoundException ex) {
			response.sendRedirect("Login.html?status=login failed");
		}
	}
}
