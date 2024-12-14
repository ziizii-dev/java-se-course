import java.util.Scanner;

public class mile_to_kilo_conver_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your mile:");
	        int mile = scanner.nextInt();
	        
		double result = miletoKiloConvert(mile);
		System.out.println(mile + " mile is "+ result + " Km");

	}
	 public static double miletoKiloConvert(int miles) {
		double result =  miles*1.609;
		return result;
		 
	 }
	
}
