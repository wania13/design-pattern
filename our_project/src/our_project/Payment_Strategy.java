package our_project;

public class Payment_Strategy {

	
	 private  Payment mypayment;

	 public void setStrategy(Payment strategy) {
		 this.mypayment = strategy;
		 }
	
	
	 public void paynow() {
		 mypayment.pay();
	 }

}
