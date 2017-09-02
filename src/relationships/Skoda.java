package relationships;

public class Skoda  extends Car{        //extending  Car class here 
	
	public void cardemo() {       //method for car demo 
		
		Engine skodacar=new Engine();   //creating object  with composition with engine class 
		skodacar.startdemo();           //start method call 
		skodacar.stopdemo();            //stop method call
		
		
	}

	
	
}
