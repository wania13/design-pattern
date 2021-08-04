package our_project;

public class Promo extends Payment_Decorators {
	
	public Promo(Order decoratedPayment) {
	      super(decoratedPayment);		
	   }
	
	   @Override
	   public void pay() {
		   decoratedPayment.pay();	       
		   System.out.println("Decorator: Promo");
	   }
		   
}

