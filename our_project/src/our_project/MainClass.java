package our_project;

import java.util.Scanner;

public abstract class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner Scan = new Scanner(System.in);
		 System.out.println("Welcome to Food Panda" + "\n" +
		 "Please choose your favourite restaurant: Available restaurants are .." +
		 "\n"+ "---Kfc"+"\n"+"---Mcdonalds"); 
		 
		 
		 
		 
		 //Client choosing restaurant (factory)
		 //Client is directly dealing with abstract interface of factories (restaurant)
		 String Restaurant = Scan.next();
		 RestaurantFactory.MyRestaurant(Restaurant.toLowerCase());
		
		 //client asking for menu
		 System.out.println("Do you want to see the menu card?"); 
		 String menuchoice =Scan.next();
		 RestaurantFactory.MyMenu(menuchoice.toLowerCase());
				 
		 //Client choosing food item (products)
		 //objects (food items) will be created from the respective factory
	     String myorder=Scan.next();
	     RestaurantFactory.MyOrder(myorder.toLowerCase());
	     
			
		 //Client choosing payment method
	     System.out.println("Confirm Order ?");
		 String confirmation=Scan.next(); 
		 if (confirmation.equals("yes")) {
			 
		 //Client choosing its strategy	 
		 System.out.println("Please choose payment method"+"\n"+"1-COD"+"\n"+"2-Wallet"); 
		 String paymentchoice=Scan.next(); 
		  
		 //object of context class
		 Payment_Strategy mychoicepay =new Payment_Strategy();
		 
		 //strategy object (payment method) is created based on user choice
			if (paymentchoice.equals("cod")) 
		      { 
			    mychoicepay.setStrategy(new COD());
				mychoicepay.paynow();
				
				//decorator is chosen by user and decorator is wrapped in chosen payment method
				System.out.println("Do you have any Voucher,Promo or Discount?"); 
				String decoratorchoice=Scan.next(); 
				
				if (decoratorchoice.equals("discount"))
				{Payment mydiscount = new Discount(new COD());mydiscount.pay();}
				
				else if(decoratorchoice.equals("voucher"))
				{Payment mydiscount = new Voucher(new COD());mydiscount.pay();}
				
				else {Payment mydiscount = new Promo(new COD());mydiscount.pay();}
				
		      } 
			
			else
		      { 
				mychoicepay.setStrategy(new Panda_Wallet());
				mychoicepay.paynow();
				
				System.out.println("Do you have any Voucher,Promo or Discount?"); 
				String decoratorchoice=Scan.next(); 
				
				//decorator is chosen by user and decorator is wrapped in chosen payment method
				if (decoratorchoice.equals("discount"))
				{Payment mydiscount = new Discount(new Panda_Wallet());mydiscount.pay();}
				
				else if(decoratorchoice.equals("voucher"))
				{Payment mydiscount = new Voucher(new Panda_Wallet());mydiscount.pay();}
				
				else {Payment mydiscount = new Promo(new Panda_Wallet());mydiscount.pay();}
				
		      } 
			
				
			
		 }
			  
		
			 
	     
	     
	     
	     
	    
	     
	     
	     
	     
	     
	     
	     Scan.close();
	 }

	
	 

		
}


