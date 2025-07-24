package Interface_lesson;

public class App {

	public static void main(String[] args) {

		Car car = new Car();
		Motorbike bike = new Motorbike();
//		Machine mac = new Car();
//		Machine mac = new Motorbike();
		
		test(car);
	}
	public static void test(Machine machine) {
		machine.start();
		machine.stop();

	}
	

}
