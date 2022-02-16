package com.traineeMgmt.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.traineeMgmt.model.persistance.trainee.Trainee;
import com.traineeMgmt.model.service.TraineeService;
import com.traineeMgmt.model.service.TraineeServiceImpl;

@WebServlet("/traineeController.do")
public class TraineeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TraineeService traineeService = new TraineeServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if (action.equalsIgnoreCase("showall")) {
			List<Trainee> trainees = traineeService.getAll();
			request.setAttribute("Trainees", trainees);
			RequestDispatcher rd = request.getRequestDispatcher("AllTrainee.jsp");
			rd.forward(request, response);
		}
		else if(action.equalsIgnoreCase("addtrainee")) {
			RequestDispatcher rd = request.getRequestDispatcher("addTrainee.jsp");
			rd.forward(request, response);
		}
	}
	
	//Add or update ?

	//PRG:After "P"ost "R"edirect to "G"et
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String branch=request.getParameter("branch");
		Double percentage=Double.parseDouble(request.getParameter("percentage"));
		
		
		Trainee trainee=new Trainee(name, branch, percentage);
		
		traineeService.addTrainee(trainee);
		
		response.sendRedirect("traineeController.do?action=showall");
	}

}
