
public class Student {
	static int count;

	int id;
	String name;
	public void introduce() {
		System.out.println("Hello");
		System.out.println("I'm " + name +" with id " + id);
	}
public static void showCount() {
	System.out.println("Static showCount"+ count);
}
}
