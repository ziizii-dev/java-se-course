import java.util.Scanner;
public class scanner_class {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your name:");

	        String name = scanner.nextLine();
	        System.out.println("Enter your city:");

	        String city = scanner.nextLine();

	        System.out.println("City:"+city);
	        System.out.println("Hello, " + name + "!");
	    }

}



