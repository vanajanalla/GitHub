package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.MemberBean;
import bean.AdminBean;
import bean.MemberAccountBean;

public class DataBaseOperation {
	static PreparedStatement ps = null;
	static ResultSet rs = null;
	static Connection con=DBConnection.getConnection().connect;
	
	public boolean loginValidate(AdminBean adminbean) {

		boolean status = false;
		try {
			ps = con.prepareStatement("select * from admin_table where AdminId=? and AdminPassword=?");
			ps.setString(1, adminbean.getAdminId());

			ps.setString(2, adminbean.getAdminPassword());

			rs = ps.executeQuery();

			status = rs.next();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return status;
	}

	public static int getSerialNo()// method returning integer value
	{
		int sno = 0;
		// if we declare after the method open we can access whole method
		try {
			// try is a block if we declare any thing in block it belogs to
			// local variable
			// so we cant acess out side.
			// dis query for getting a serial no
			ps = con.prepareStatement("select S_No from member_table");

			rs = ps.executeQuery();

			while (rs.next()) {
				sno = rs.getInt(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return sno;
		// returning statement should be last of the method
	}// method close

	public int addMember(MemberBean addmemberbean) {
		int result = 0;
		try {
			String query = "insert into  member_table  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			ps = con.prepareStatement(query);
			ps.setInt(1,addmemberbean.getSno());
			ps.setString(2, addmemberbean.getMemberId());
			ps.setString(3, addmemberbean.getName());
			ps.setString(4, addmemberbean.getDob());
			ps.setString(5, addmemberbean.getMobileno());
			ps.setString(6, addmemberbean.getEmail());
			ps.setString(7, addmemberbean.getAddress1());
			ps.setString(8, addmemberbean.getAddress2());
			ps.setString(9, addmemberbean.getDoj());
			ps.setString(10, addmemberbean.getReviewDate());
			ps.setString(11, addmemberbean.getBp_Rate());
			ps.setString(12, addmemberbean.getHeight());
			ps.setString(13, addmemberbean.getWeight());
			ps.setString(14, addmemberbean.getNeck());
			ps.setString(15, addmemberbean.getShoulderWidth());
			ps.setString(16, addmemberbean.getChest());
			ps.setString(17, addmemberbean.getRightArm());
			ps.setString(18, addmemberbean.getLeftArm());
			ps.setString(19, addmemberbean.getFormArm());
			ps.setString(20, addmemberbean.getUpperAbdomen());
			ps.setString(21, addmemberbean.getWaist());
			ps.setString(22, addmemberbean.getLowerAbdomen());
			ps.setString(23, addmemberbean.getHips());
			ps.setString(24, addmemberbean.getThigh());
			ps.setString(25, addmemberbean.getCalf());
			ps.setString(26, addmemberbean.getBodyfat());
			ps.setString(27, addmemberbean.getLbm());
			ps.setString(28, addmemberbean.getBmr());
			ps.setString(29, addmemberbean.getBmi());

			result = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} 
		
		return result;

	}

	public String getMemberId(String memberid_mobileNo) {
		String memberId = null;
		String query = "select memberid from member_table where memberid=?";
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, memberid_mobileNo);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return memberId;
	}

	public int updateAccountDetails(MemberAccountBean mabean)// dis method is accepting bean so you need to set values before passing
	{
		int value=0;
		String query="insert into account_table values(?,?,?,?,?,?)";
		try {
			ps=con.prepareStatement(query);
			
			ps.setString(1, mabean.getMemberId());
			ps.setString(2, mabean.getPaymentDate());
			ps.setString(3, mabean.getPaymentAmount());
			ps.setString(4, mabean.getNextpaymentDate());
			ps.setString(5, mabean.getNextpaymentAmount());
			ps.setBoolean(6, mabean.getFlag());
			value=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
	}
	
	/*public int updateAddMember(AddMemberBean addmemberbean)
	{
		int update=0;
		String query="update member_table where memberid=?";
		try {
			ps=con.prepareStatement(query);
			ps.setString(3, addmemberbean.getName());
		
			ps.setString(4, addmemberbean.getDob());
			ps.setString(5, addmemberbean.getMobileno());
			ps.setString(6, addmemberbean.getEmail());
			ps.setString(7, addmemberbean.getAddress1());
			ps.setString(8, addmemberbean.getAddress2());
			ps.setString(9, addmemberbean.getDoj());
			ps.setString(10, addmemberbean.getReviewDate());
			ps.setString(11, addmemberbean.getBp_Rate());
			ps.setString(12, addmemberbean.getHeight());
			ps.setString(13, addmemberbean.getWeight());
			ps.setString(14, addmemberbean.getNeck());
			ps.setString(15, addmemberbean.getShoulderWidth());
			ps.setString(16, addmemberbean.getChest());
			ps.setString(17, addmemberbean.getRightArm());
			ps.setString(18, addmemberbean.getLeftArm());
			ps.setString(19, addmemberbean.getFormArm());
			ps.setString(20, addmemberbean.getUpperAbdomen());
			ps.setString(21, addmemberbean.getWaist());
			ps.setString(22, addmemberbean.getLowerAbdomen());
			ps.setString(23, addmemberbean.getHips());
			ps.setString(24, addmemberbean.getThigh());
			ps.setString(25, addmemberbean.getCalf());
			ps.setString(26, addmemberbean.getBodyfat());
			ps.setString(27, addmemberbean.getLbm());
			ps.setString(28, addmemberbean.getBmr());
			ps.setString(29, addmemberbean.getBmi());
			update=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return update;
		
	}*/
	public boolean validateMember(String memberId)
	{
		boolean flag=false;
		try {
	String query="select memberid from member_table where memberid=?" ;
	ps = con.prepareStatement(query);
	ps.setString(1, memberId);
		rs = ps.executeQuery();
		while (rs.next()) {
			flag = true;
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return flag;
	}
	public ArrayList<MemberBean> memberDetails(String memberId)
	{
		ArrayList<MemberBean> memberlist=new ArrayList<MemberBean>();
		MemberBean memberbean;
		try {
		String query="select * from member_table where memberid=?";
		
			ps=con.prepareStatement(query);
			ps.setString(1, memberId);
		    rs=ps.executeQuery();
		    while(rs.next())
		    {
		    	memberbean=new MemberBean();
		    	
		    	memberbean.setMemberId(rs.getString(2));
		    	memberbean.setName(rs.getString(3));
		    	memberbean.setDob(rs.getString(4));
		    	memberbean.setMobileno(rs.getString(5));
		    	memberbean.setEmail(rs.getString(6));
		    	memberbean.setAddress1(rs.getString(7));
		    	memberbean.setAddress2(rs.getString(8));
		    	memberbean.setDoj(rs.getString(9));
		    	memberbean.setReviewDate(rs.getString(10));
		    	memberbean.setBp_Rate(rs.getString(11));
		    	memberbean.setHeight(rs.getString(12));
		    	memberbean.setWeight(rs.getString(13));
		    	memberbean.setNeck(rs.getString(14));
		    	memberbean.setShoulderWidth(rs.getString(15));
		    	memberbean.setChest(rs.getString(16));
		    	memberbean.setRightArm(rs.getString(17));
		    	memberbean.setLeftArm(rs.getString(18));
		    	memberbean.setFormArm(rs.getString(19));
		    	memberbean.setUpperAbdomen(rs.getString(20));
		    	memberbean.setWaist(rs.getString(21));
		    	memberbean.setLowerAbdomen(rs.getString(21));
		    	memberbean.setHips(rs.getString(22));
		    	memberbean.setThigh(rs.getString(23));
		    	memberbean.setCalf(rs.getString(24));
		    	memberbean.setBodyfat(rs.getString(25));
		    	memberbean.setLbm(rs.getString(26));
		    	memberbean.setBmr(rs.getString(27));
		    	memberbean.setBmi(rs.getString(28));
		        memberlist.add(memberbean);
		    	
		    	
		    
		    	
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return memberlist;
		
	}
	
}