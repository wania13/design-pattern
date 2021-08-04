package our_project;

public abstract class RestaurantFactory {
	 
	 abstract Drinks OrderDrink() ;
	 abstract Meal OrderMeal() ;
	 abstract void showMessage();
	 
	 static RestaurantFactory mychoice;
	 public static void MyRestaurant (String restaurant){  
		 
		 
		 
		 
			
	      if(restaurant.equals("kfc"))
	      { 
	    	  mychoice = new Kfc();
	    	  mychoice.showMessage();
	    	  
	      }
	      
	      else
	      {
	    	  mychoice = new Mcdonald();
    	      mychoice.showMessage();
	      }
	  	}
	 
	 public static void MyMenu (String choice){  
		 
		 if (choice.equals("yes")) {
			 Manual.getInstance().ManualPrint(mychoice.toString());
		}
		 
		 else {System.out.println("So .. what do u want to order? " +"\n"+ "--Meal" + "\n" + "--Drink");}
		 
	 }
	 
	 public static void MyOrder (String myorder){  
		 
		 if (myorder.equals("meal")) {
			Meal order= mychoice.OrderMeal();
			order.mymeal();
		 }
		 
		 else if (myorder.equals("drink")) {
			 Drinks order= mychoice.OrderDrink();
			 order.mydrink();
		 }
		 
		 else if  (myorder.equals("both")) {
			 Meal order1= mychoice.OrderMeal();
			 order1.mymeal();
			 Drinks order2= mychoice.OrderDrink();
			 order2.mydrink();
			 
		 }
	 }
	 
}


