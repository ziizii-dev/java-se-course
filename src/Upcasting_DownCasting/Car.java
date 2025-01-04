package Upcasting_DownCasting;

public class Car extends Machine {
	
	@Override
	public void start() {
		System.out.println("Car start");
	}
	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
	public void changeGear() {
		System.out.println("Car Gear changed");
	}
	

}
