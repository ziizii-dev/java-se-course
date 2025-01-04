package Upcasting_DownCasting;

public class App {

	public static void main(String[] args) {

		    Machine mac = new Machine();
		    
//		     mac.start();
//		     mac.stop();
		     
		     
		    Car car = new Car();
//		    car.start();
//		    car.stop();
//		    car.changeGear();
		    Machine  mac2 = car;  //in parent assign with child is called upcasting
//		    mac2.start();
//		    mac2.start();
//		    
		    Car car2 = (Car)mac2; //in child assign with parent is called downcasting
		    car2.start();
		    car2.stop();
		    car2.changeGear();
		
	}

}
