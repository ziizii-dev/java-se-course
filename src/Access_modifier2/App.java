package Access_modifier2;

import Access_modifers.Machine;

public class App {

	public static void main(String[] args) {

		
		Machine mac = new Machine();
		mac.id = 50;
		//mac.name = "Power4";  //this is private
		//mac.color = "Black";  //this is protected
		//mac.count = 24;       //this is no modifier
	}

}
