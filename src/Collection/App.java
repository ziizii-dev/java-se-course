package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class App {

	public static void main(String[] args) {

		Collection<Person> pArray = getData();
		
		for(Person person: pArray) {
		    	System.out.println("Name : " + person.getName() + "| Age : " + person.getAge());
		
		}
		}
		
		
	
	 public static Collection <Person> getData(){
		 
		 Person p1 = new Person("John",18);
		 Person p2 = new Person("Kalvin",19);
		 Person p3= new Person("Cano",20);
		 
		 Collection<Person> collection = new ArrayList<>();
		 
		 collection.add(p1);
		 collection.add(p2);
		 collection.add(p3);
		 
		 return collection;

		
		 
		 
	 }

}
