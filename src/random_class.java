import java.util.Random;


public class random_class {

	public static void main(String[] args) {
     Random random = new Random();
     int number = random.nextInt();
     int number1 = random.nextInt(9);  //ans is between 0 to 9 always lessthan 9;

     double number2 = random.nextDouble();
     float number3 = random.nextFloat();
     System.out.println("Random:"+number);
     System.out.println("Random:"+number1);
     System.out.println("Random:"+number2);   //it includes between 0 and 1;
     System.out.println("Random:"+number3);
     
	}
	//to import shortkey use command shit o;

}
