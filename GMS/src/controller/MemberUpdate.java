package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DBConnection;
import dao.DataBaseOperation;

import bean.MemberBean;
import businessLogics.GeneratorId;

/**
 * Servlet implementation class MemberUpdate
 */
@WebServlet("/MemberUpdate")
public class MemberUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberUpdate() {
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
		String memberid=request.getParameter("memberid"); 
		
		// create DataBaseOperation object with ref call validateMember method.
		DataBaseOperation database=new DataBaseOperation();
		boolean mem_valid=database.validateMember(memberid);
	request.setAttribute("memberid", memberid);
		//objct ref.call method and pass here memberid
		if(mem_valid)
		{
			
			RequestDispatcher dispacher=request.getRequestDispatcher("UpdateMember.jsp");
			dispacher.forward(request, response); 
		}
		else
		{
			RequestDispatcher dispacher=request.getRequestDispatcher("UpdateMember.html");
			dispacher.include(request, response);
		}
		//if mem_valid is true= redirectupdatemember.jsp
		//if false include memberupdate.html
		
	}

}
