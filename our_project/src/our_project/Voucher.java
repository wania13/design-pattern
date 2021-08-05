package our_project;

public class Voucher extends Payment_Decorators {
	
	public Voucher(Payment decoratedPayment) {
	      super(decoratedPayment);		
	   }
	
	   @Override
	   public void pay() {
		   decoratedPayment.pay();	       
		  System.out.println("Decorator: Voucher");
	   }
}
