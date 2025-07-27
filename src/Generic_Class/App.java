package Generic_Class;

public class App {

	public static void main(String[] args) {
		
		
		Box<Integer> box = new Box<Integer>();
		box.set(1234);
	   Integer value1 = box.get();
	   System.out.println(value1);
	    Box<String> box1 = new Box<String>();
	   // Box<String> box1 = new Box<>();
	    box1.set("Hello World");;
	   String value2 = box1.get();
	    System.out.println(value2 );
	    
	    
	    //Generic can be applied by the person who incentirator;
	}

}
