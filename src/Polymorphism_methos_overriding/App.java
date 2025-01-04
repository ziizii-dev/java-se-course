package Polymorphism_methos_overriding;

public class App {

	//need extend child to parent and write @Override and the App data change with using casting method ,this so called polymorphism with overriding
	 
	public static void main(String[] args) {
		 Person person = new Person();
		 person.showInfo();
		
		 Student student = new Student();
		 
		 Person p2 = student;
		 p2.showInfo(); //up casting
		 
		 
		 
	}

}
