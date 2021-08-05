package our_project;

public class Panda_Wallet implements Payment {
	@Override
	public void pay() {
		System.out.println("You have selected Panda Wallet as payment method");
	}
}
