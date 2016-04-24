package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataBaseOperation;

import bean.AdminBean;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String AdminId=request.getParameter("AdminId");
		String AdminPassword=request.getParameter("AdminPassword");
		AdminBean bean=new AdminBean();
		bean.setAdminId(AdminId);
		bean.setAdminPassword(AdminPassword);
		DataBaseOperation dbo=new DataBaseOperation();
		boolean result=dbo.loginValidate(bean);
		if(result)
		{
		RequestDispatcher dispacher=request.getRequestDispatcher("AdminView.jsp");
		dispacher.forward(request, response);
		}
		else
		{
			out.println("sorry invalid login and password..");
			RequestDispatcher dispacher=request.getRequestDispatcher("AdminLogin.jsp");
			dispacher.include(request, response);
		}
		
	}

}
