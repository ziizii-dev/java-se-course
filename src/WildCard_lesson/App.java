package WildCard_lesson;

public class App {

	public static void main(String[] args) {
             Box<String> box1 = new Box<>();
             box1.set("Hello World");
             
             
             Box<Person> box2 = new Box<>();
             
            box2.set(new Person());

            
            
            Box<Student> box3 = new Box<>();
            box3.set(new Student());
             
             showBoxData(box3);
             
	}
	
	
	public static void showBoxData(Box<? extends Person > box) {
		
		System.out.println("Box Data: "+ box.get());
		
		
		
	}

}
