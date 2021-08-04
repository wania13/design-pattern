package our_project;

public class Payment {

	
	 private  Order mypayment;

	 public void setStrategy(Order strategy) {
		 this.mypayment = strategy;
		 }
	
	
	 public void paynow() {
		 mypayment.pay();
	 }

}
