package our_project;

public abstract class Payment_Decorators implements Order{
	
	protected Order decoratedPayment;

	
	public Payment_Decorators(Order decoratedPayment){
	      this.decoratedPayment = decoratedPayment;
	   }

	   public void pay(){
		   decoratedPayment.pay();
	   }	
}
