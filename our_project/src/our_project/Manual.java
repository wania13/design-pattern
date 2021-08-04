package our_project;

public class Manual {
	
		   //create an object of SingleObject
		   private static Manual Manualinstance;

		   //make the constructor private so that this class cannot be
		   //instantiated
		   private Manual(){}

		   //Get the only object available
		   public static Manual getInstance(){
			   
			  if (Manualinstance == null) {Manualinstance = new Manual();
		      return Manualinstance;}
			  
			  else
			  return Manualinstance;
		   }

		   public void ManualPrint(String mymenu){
			   
			if (mymenu.contains("Kfc")){
		      System.out.println("Kfc Menu!"+"\n"+"1- WoW Box: Rs 500"+"\n"+"2- Cold Drink: Rs 100");
		   }
			   
			   else {
			   System.out.println("Mcdonald Menu!"+"\n"+"1- Happy Meal Box: Rs 500"+"\n"+"2- Shake: Rs 100");
			   }
			System.out.println("So .. what do u want to order? " +"\n"+ "--Meal" + "\n" + "--Drink");
			
		   }
		   
		   
	

}