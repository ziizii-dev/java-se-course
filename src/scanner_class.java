import java.util.Scanner;
public class scanner_class {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your name:");

	        String name = scanner.nextLine();
	        System.out.println("Enter your city:");

	        String city = scanner.nextLine();
	        System.out.println("Enter your age:");

	        int age = scanner.nextInt();

	        System.out.println("City:"+city);
	        System.out.println("Hello, " + name + "!");
	        System.out.println("Your age:"+age);
	    }
//int ကို အရင် တောင်းရင် err ရှိမယ်။ nextline မစောင့်တော့တဲ့err တက်တာ
}



