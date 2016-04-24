<!DOCTYPE html>
<%@page import="dao.DataBaseOperation"%>
<%@page import="bean.MemberBean" %>
<%@page import="java.util.*" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/validations/validation.js">
</script>

</head>
<body>
	<form action="AddMemberServlet" method="post" name="formfd" >
		<fieldset>
			<legend align="left">Personal Details</legend>
			<%String memberid=(String)request.getAttribute("memberid"); %>
			<%
             DataBaseOperation databaseoperation=new DataBaseOperation();
                   ArrayList<MemberBean> memberist=databaseoperation.memberDetails(memberid);
                   
Iterator<MemberBean> itr=memberist.iterator();
MemberBean memberbean=null;
while(itr.hasNext()){
 memberbean	=(MemberBean)itr.next();
}
if(memberbean!=null)
%>
			<table> 
			<tr>
					<td>MemberId:</td>
					<td><input type="text" name="memberid"  disabled="disabled" value=<%=memberid %>></td>
					
				</tr>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="membername" value=<%=memberbean.getName()%> onkeyup="return clearMethod()" onkeypress="return lettersOnly(event)"></td>
					<td>
					<span id="errormembername"></span>
					</td>
				</tr>
				<tr>
					<td>Date of birth:</td>
					<td><input type="text" name="dob" value=<%=memberbean.getDob() %> placeholder="mm/dd/year" onkeyup="return clearMethod()" onkeypress="return isNumbers(event)" ></td>
					<td>
					<span id="errordob"></span> 
				</tr>
				<tr>
					<td>Mobile No</td>
					<td><input type="text" name="mobileno" value=<%=memberbean.getMobileno() %>   maxlength="10" onkeyup="return clearMethod()"  onkeypress="return isNumber(event) "></td>
					<td>
					<span id="errormobileno"></span>
					</td>
				</tr>
				<tr>
					<td>E-Mail:</td>
					<td><input type="email" name="email" value=<%=memberbean.getEmail() %> onkeyup="return clearMethod()"></td>
					<td>
					<span id="erroremail"></span>
					</td>
				</tr>
				<tr>
					<td>Address1:</td>
					<td><input type="text" name="address1" value=<%=memberbean.getAddress1() %> onkeyup="return clearMethod()"></td>
					<td>
					<span id="erroraddress1"></span>
					</td>
				</tr>
				<tr>
					<td>Address2:</td>
					<td><input type="text" name="address2" value=<%=memberbean.getAddress2() %> onkeyup="return clearMethod()"></td>
						<td>
					<span id="erroraddress2"></span>
					</td>
				</tr>
				<tr>
					<td>Date Of Joining:</td>
					<td><input type="date" name="doj" value=<%=memberbean.getDoj() %> placeholder="mm/dd/year" onkeyup="return clearMethod()" onkeypress="return isNumbers(event) "></td>
						<td>
					<span id="errordoj"></span>
					</td>
				</tr>
			</table>
		</fieldset>
		<fieldset>
			<legend align="left">Physical Details</legend>
			<table>
				<tr>
					<td>Height:</td>
					<td><input type="text" name="mem_height" value=<%=memberbean.getHeight() %> placeholder="cms" onkeypress="return isNumber(event)"></td>
					<td>Upper Abdomen:</td>
					<td><input type="text" name="mem_uprabdomen" value=<%=memberbean.getUpperAbdomen() %>  onkeypress="return isNumber(event)" ></td>
				</tr>
				<tr>
					<td>Weight:</td>
					<td><input type="text" name="mem_weight"  value=<%=memberbean.getWeight() %> placeholder="kg" onkeypress="return isNumber(event)"></td>
					<td>Waist:</td>
					<td><input type="text" name="mem_waist" value=<%=memberbean.getWaist() %> onkeypress="return isNumber(event)"></td>
				</tr>
				<tr>
					<td>B.P- Heart + Rate:</td>
					<td><input type="text" name="mem_bp" value=<%=memberbean.getBp_Rate() %> onkeypress="return isNumber(event)"></td>
					<td>Lower Abdomen:</td>
					<td><input type="text" name="mem_lwrabdomen" value=<%=memberbean.getLowerAbdomen() %> onkeypress="return isNumber(event)"></td>
				</tr>
				<tr>
					<td>Neck:</td>
					<td><input type="text" name="mem_neck" value=<%=memberbean.getNeck() %> onkeypress="return isNumber(event)"></td>
					<td>Hips:</td>
					<td><input type="text" name="mem_hips" value=<%=memberbean.getHips() %> onkeypress="return isNumber(event)"></td>
				</tr>
				<tr>
					<td>Shoulder Width:</td>
					<td><input type="text" name="mem_shoulder" value=<%=memberbean.getShoulderWidth() %> onkeypress="return isNumber(event)"></td>
					<td>Thigh:</td>
					<td><input type="text" name="mem_thigh" value=<%=memberbean.getThigh() %> onkeypress="return isNumber(event)"></td>
				</tr>
				<tr>
					<td>Chest:</td>
					<td><input type="text" name="mem_chest" value=<%=memberbean.getChest() %> onkeypress="return isNumber(event)"></td>
					<td>Calf:</td>
					<td><input type="text" name="mem_calf"  value=<%=memberbean.getCalf() %> onkeypress="return isNumber(event)"></td>
				</tr>
				<tr>
					<td>Right Arm:</td>
					<td><input type="text" name="mem_rightarm" value=<%=memberbean.getRightArm() %> onkeypress="return isNumber(event)"></td>
					<td>Body Fat:</td>
					<td><input type="text" name="mem_bodyfat" value=<%=memberbean.getBodyfat() %> onkeypress="return isNumber(event)"></td>
				</tr>
				<tr>
					<td>Left Arm:</td>
					<td><input type="text" name="mem_leftarm"  value=<%=memberbean.getLeftArm() %> onkeypress="return isNumber(event)"></td>
					<td>L.B.M :</td>
					<td><input type="text" name="mem_LBM" value=<%=memberbean.getLbm() %> onkeypress="return isNumber(event)"></td>
				</tr>
				<tr>
					<td>Fore Arm:</td>
					<td><input type="text" name="mem_forearm" value=<%=memberbean.getFormArm() %> onkeypress="return isNumber(event)"></td>
					<td>B.M.R :</td>
					<td><input type="text" name="mem_BMR"  value=<%=memberbean.getBmr() %> onkeypress="return isNumber(event)"></td>
					<td>B.M.J :</td>
					<td><input type="text" name="mem_BMJ"  value=<%=memberbean.getBmi() %> onkeypress="return isNumber(event)"></td>
				</tr>
			</table>
		</fieldset>
		<table>
		<tr>
		<td>
		<input type="submit" name="submit" value="Update" onclick="return validate()">
		</td>
		<td>
		<input type="reset" name="reset" value="Clear">
		</td>
		</tr>
		</table>
	</form>

</body>
</html>