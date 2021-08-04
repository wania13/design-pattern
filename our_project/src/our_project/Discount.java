package our_project;

public class Discount extends Payment_Decorators {
	
	public Discount(Order decoratedPayment) {
	      super(decoratedPayment);		
	   }
	
	   @Override
	   public void pay() {
		   decoratedPayment.pay();	       
		   System.out.println("Decorator: Discount");
		 }



}
