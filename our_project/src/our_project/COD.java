package our_project;

public class COD implements Order{
	@Override
	public void pay() {
		System.out.println("You have selected COD as payment method");
	}
}
