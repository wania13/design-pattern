package our_project;

public class Kfc extends RestaurantFactory{
	 @Override
	 public Drinks OrderDrink()
	 {return new ColdDrinks();} 
	 
	 @Override
	 public Meal OrderMeal() 
	 {return new WowBox();}
	 
	 @Override
	 public void showMessage(){
	      System.out.println("Welcome to Kfc!");
	 }
}
