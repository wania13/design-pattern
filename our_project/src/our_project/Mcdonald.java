package our_project;


public class Mcdonald extends RestaurantFactory{
	
	 @Override
	 public Drinks OrderDrink()
	 {return new Shakes();} 
	 
	 @Override
	 public Meal OrderMeal() 
	 {return new HappyMeal();}
	 
	 @Override
	 public void showMessage(){
	      System.out.println("Welcome to Mcdonald!");
	 }
}
