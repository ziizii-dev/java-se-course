
public class method_different {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sayHello("Mg Mg");
		show("Kyaw Kyaw",80);

	}
	public static void sayHello(){
		System.out.print("Hello");
		
	}
	public static void sayHello(String name) {
		System.out.print("Hi,"+name);
	}
	public static void show(String name, int age) {
		System.out.println("Hello,"+name);
		System.out.println("your age is "+age);

	}
	public static void show(int age,String name) {
		System.out.println("Hi,"+name);
		System.out.println("your age is "+ age);

	}

}
