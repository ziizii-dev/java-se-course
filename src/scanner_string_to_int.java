import java.util.Scanner;

public class scanner_string_to_int {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your age:");

	        String ageStr = scanner.nextLine();
	        
	        int age =Integer.parseInt(ageStr);  //converted string to int
	        
	       
	        
	        
	        System.out.println("Enter your name:");

	        String name = scanner.nextLine();
	        System.out.println("Enter your city:");

	        String city = scanner.nextLine();


	        System.out.println("City:"+city);
	        System.out.println("Hello, " + name + "!");
	        System.out.println("Your age:"+age);
	        if(age >18) {
	        	System.out.println("Your are adult");
	        }else{
	        	System.out.println("Your are still young");
	        }
	    }

}
