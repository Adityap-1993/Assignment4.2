package relationships;


/*
 this program is to demonstrate IS-A HAS-A relationship in java
program will show Is A relation between Car and skoda class 
program will show HAS A relation between  skoda and Engine Class

*/

public class Car {           //class definition
	
	private String color;           //instance variable 1
	
	
	private int maxspeed;        //instance variable 2

	public String getColor() {         //defining getters and setters for variables
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxspeed() {
		return maxspeed;
	}

	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	
	public void cardetails()        //method for showing car details
	{
		System.out.println("The color of car is " + color + " and maximum speed is " + maxspeed + " kmph.");
		
	}

}//class ends
