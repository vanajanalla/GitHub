package bean;

public class MemberAccountBean {

	String MemberId;
	String paymentDate;
	String paymentAmount;
	String nextpaymentDate;
	String nextpaymentAmount;
	boolean flag;
	public String getMemberId() {
		return MemberId;
	}
	public void setMemberId(String memberId) {
		MemberId = memberId;
	}
	
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getNextpaymentDate() {
		return nextpaymentDate;
	}
	public void setNextpaymentDate(String nextpaymentDate) {
		this.nextpaymentDate = nextpaymentDate;
	}
	public String getNextpaymentAmount() {
		return nextpaymentAmount;
	}
	public void setNextpaymentAmount(String nextpaymentAmount) {
		this.nextpaymentAmount = nextpaymentAmount;
	}
	public boolean getFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
