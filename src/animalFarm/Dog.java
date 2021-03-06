package animalFarm;

import javax.swing.JOptionPane;

public class Dog extends Mamal{
	
	private int age;
	
	public Dog() {
	}
	
	public Dog(int age, int legsAndHandsTotal, String isExtincted, String isDomestic, String isVegeterian, String latinName) {
		super(legsAndHandsTotal, isExtincted, isDomestic, isVegeterian, latinName);
		this.age = age; 
	}
	
	public int getAge() {
		return age;
	}
	
    @Override
    public void introduce() {
    	
    	
        String message = "Here I introduce a cute dog: \n "
        		  + "Name: " + latinName
                  + "\n Is extinct: "   + isExtincted 
                  + "\n Age: " + age 
                  + "\n Number of Legs and Hands: " + legsAndHandsTotal
        		  + "\n Is Domestic: " + isDomestic;
        JOptionPane.showMessageDialog(null, message);
    }
	
}




