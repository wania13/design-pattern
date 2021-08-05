package our_project;

public class COD implements Payment{
	@Override
	public void pay() {
		System.out.println("You have selected COD as payment method");
	}
}
