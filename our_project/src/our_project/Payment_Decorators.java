package our_project;

public abstract class Payment_Decorators implements Payment{
	
	protected Payment decoratedPayment;

	
	public Payment_Decorators(Payment decoratedPayment){
	      this.decoratedPayment = decoratedPayment;
	   }

	   public void pay(){
		   decoratedPayment.pay();
	   }	
}
