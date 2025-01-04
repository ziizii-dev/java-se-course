package Polymorphism_method_overloading;

public class person {
	//overloading
	public void showInfo() {
		System.out.println("I am person class");
		
	}
	public void showInfo(int id) {
		System.out.println("I am person class with id " +id);
		
	}
	public void showInfo(int id , String name) {
		System.out.println("I am person class with " + " name is " + name + " & id is " + id);
		
	}
	public void showInfo(String name) {
		System.out.println("I am person class with name  " + name);
		
	}

}
