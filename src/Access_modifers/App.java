
/*
 * public - it can use  anywhere;
 * private - it can use only within class;
 * protected - it can use same package and child package where extends form parent class
 * no-modifier - it can use only within class ;
 * 
 */

package Access_modifers;



public class App {

	public static void main(String[] args) {
      Machine mac = new Machine();
      mac.id = 34;
     // mac.name = "power4";   // name is private so it will err
      mac.color = "white";
      mac.count = 23;
    		  
	}

}
