
public class Car extends Machine {
 
	public void carStop() {
		System.out.println("Car Stopped");
	}
	@Override

	public void stop() {
		System.out.println("Car of Machine stop");
	}
	

}
