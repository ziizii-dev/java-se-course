package Abstruct;

public class App {

	public static void main(String[] args) {
      Machine machineCar = new Car();
      Machine machineCamera = new Camera();
      machineCar.start();
      machineCamera.start();
      machineCar.stop();
      machineCamera.stop();
      machineCar.showInfo();
      machineCamera.showInfo();

      
      
      
      
      

      
	}

}
