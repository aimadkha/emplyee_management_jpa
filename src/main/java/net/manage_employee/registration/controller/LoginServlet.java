/*package net.manage_employee.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import net.manage_employee.registration.dao.EmployeeDao;
import net.manage_employee.registration.repository.EmployeeRepositoryImp;
import net.manage_employee.registration.repository.IEmployeeRepository;
import net.manage_employee.registration.thymleaf.TemplateEngineUtil;

/**
 * Servlet implementation class LoginServlet
 */
/*
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao employeeDao;
	private IEmployeeRepository empRepo;
	TemplateEngine engine;
	WebContext context;
       */
    /**
     * @see HttpServlet#HttpServlet()
     */
	/*
    public LoginServlet() {
    	this.employeeDao = new EmployeeDao();
    	this.empRepo = new EmployeeRepositoryImp();
    }
    */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    /*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.engine = TemplateEngineUtil.getTemplateEngine(request.getServletContext());
		this.context = new WebContext(request, response, request.getServletContext());
		response.setCharacterEncoding("utf-8");
		engine.process("login.html", context, response.getWriter());
	}
*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.engine = TemplateEngineUtil.getTemplateEngine(request.getServletContext());
		this.context = new WebContext(request, response, request.getServletContext());
		response.setCharacterEncoding("utf-8");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		//Employee emp = empRepo.getEmployeeByEmail(email);
		if(empRepo.checkAdmin(email, pass)) {
				HttpSession session = request.getSession();
				session.setAttribute("email", email);
				RequestDispatcher rs = request.getRequestDispatcher("employee");
	            rs.forward(request, response);
				//response.sendRedirect("employee");

				//engine.process("employees.html", context, response.getWriter());
				//engine.process("login.html", context, response.getWriter());

		}
		else {
			engine.process("login.html", context, response.getWriter());
		}
	}

}

*/
