package our_project;

public class Voucher extends Payment_Decorators {
	
	public Voucher(Order decoratedPayment) {
	      super(decoratedPayment);		
	   }
	
	   @Override
	   public void pay() {
		   decoratedPayment.pay();	       
		  System.out.println("Decorator: Voucher");
	   }
}
