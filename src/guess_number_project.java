import java.util.Random;
import java.util.Scanner;

public class guess_number_project {

	public static void main(String[] args) {
		Random randomNumber = new Random();
 	int secretNum = randomNumber.nextInt(100);
 	//System.out.println("Random number:" + secretNum);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess my number:");
		int result = scanner.nextInt();
		while(result != secretNum) {
			System.out.println("Wrong Number,Guess again please:");
			if(result  > secretNum) {
				System.out.println("Greater than my number,try again please");
			}else if(result< secretNum){
				System.out.println("Less than my number,try again please");
			}
			 result = scanner.nextInt();
		}
		System.out.println("Corret!"+ result);
	}
	

}
