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

import bean.MemberBean;
import bean.MemberAccountBean;
import businessLogics.GeneratorId;

/**
 * Servlet implementation class AddMemberServlet
 */
@WebServlet("/AddMemberServlet")
public class AddMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMemberServlet() {
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
		String memberId=request.getParameter("memberid");
	
		if(memberId!=null)
	    {
			 memberId=GeneratorId.generatorId(DataBaseOperation.getSerialNo());
	    }
		
		
		
		String name=request.getParameter("membername");
		String dob=request.getParameter("dob");
		String mobileno=request.getParameter("mobileno");
		String email=request.getParameter("email");
		String address1=request.getParameter("address1");
		String address2=request.getParameter("address2");
		String doj=request.getParameter("doj");
		String reviewdate=request.getParameter("reviewdate");
		
		String height=request.getParameter("mem_height");
		String weight=request.getParameter("mem_weight");
		String bprate=request.getParameter("mem_bp");
		String neck=request.getParameter("mem_neck");
		String shoulderWidth=request.getParameter("mem_shoulder");
		String chest=request.getParameter("mem_chest");
		String rightArm=request.getParameter("mem_rightarm");
		String leftArm=request.getParameter("mem_leftarm");
		String formArm=request.getParameter("mem_forearm");
		String upperAbdomen=request.getParameter("mem_uprabdomen");
		String waist=request.getParameter("mem_waist");
		String lowerAdbomen=request.getParameter("mem_lwrabdomen");
		String hips=request.getParameter("mem_hips");
		String thigh=request.getParameter("mem_thigh");
		String calf=request.getParameter("mem_calf");
		String bodyfat=request.getParameter("mem_bodyfat");
		String lbm=request.getParameter("mem_LBM");
		String bmr=request.getParameter("mem_BMR");
		String bmi=request.getParameter("mem_BMJ");
	    MemberBean addmemberbean=new MemberBean();
	    addmemberbean.setMemberId(memberId);
	    addmemberbean.setName(name);
	    addmemberbean.setDob(dob);
	    addmemberbean.setMobileno(mobileno);
	    addmemberbean.setEmail(email);
	    addmemberbean.setAddress1(address1);
	    addmemberbean.setAddress2(address2);
	    addmemberbean.setDoj(doj);
	    addmemberbean.setReviewDate(reviewdate);
	    addmemberbean.setBp_Rate(bprate);
	    addmemberbean.setHeight(height);
	    addmemberbean.setWeight(weight);
	    addmemberbean.setNeck(neck);
	    addmemberbean.setShoulderWidth(shoulderWidth);
	    addmemberbean.setChest(chest);
	    addmemberbean.setRightArm(rightArm);
	    addmemberbean.setLeftArm(leftArm);
	    addmemberbean.setFormArm(formArm);
	    addmemberbean.setUpperAbdomen(upperAbdomen);
	    addmemberbean.setWaist(waist);
	    addmemberbean.setLowerAbdomen(lowerAdbomen);
	    addmemberbean.setHips(hips);
	    addmemberbean.setThigh(thigh);
	    addmemberbean.setCalf(calf);
	    addmemberbean.setBodyfat(bodyfat);
	    addmemberbean.setLbm(lbm);
	    addmemberbean.setBmr(bmr);
	    addmemberbean.setBmi(bmi);
	    
	    MemberAccountBean mabean=new MemberAccountBean();
	    mabean.getMemberId();
	    mabean.getPaymentDate();
	    mabean.getPaymentAmount();
	    mabean.getNextpaymentDate();
	    mabean.getNextpaymentAmount();
	    mabean.getFlag();
	    DataBaseOperation dbo=new DataBaseOperation();
	    int results=dbo.addMember(addmemberbean);
	    int value=dbo.updateAccountDetails(mabean);// here is the method you are calling
	      if(results==1)
		{
		RequestDispatcher dispacher=request.getRequestDispatcher("AdminHome.html");
		dispacher.forward(request, response);
		}
	}
	    
	    
	}


