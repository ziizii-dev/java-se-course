package Abstruct;

public class Car extends Machine {
	@Override
	public void  start() {
		System.out.println("Car started");
		
	}
	@Override
	public void  stop() {
		System.out.println("Car stopped");
		
	}
}
