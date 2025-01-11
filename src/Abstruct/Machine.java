package Abstruct;

public abstract class Machine {
	
	public abstract void start(); // no body data ,this is call abstract method, not same to interface, check to interface lesson 
	public abstract void stop();
	public void showInfo() {
		System.out.println("I'm Machine");
		
	}
    //not the same to interface  as in abstract can write body , the same function like showInfo


}
