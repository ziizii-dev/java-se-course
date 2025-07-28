package Generic_method;


class Util {
	
	public static<T> void PrintAll(T[] array) {
		
		for(T e:array) {
			
			System.out.println(e);
			
		}
		
		
		
		
	}
	
	
}

public class App {

	public static void main(String[] args) {
		
		Integer[] numbers = {12,23,34,45};
		String[] names = {"mgmg","kyawkyaw","aye aye"};
		
		Util.<String>PrintAll(names);
		Util.<Integer>PrintAll(numbers);

		
		

	}

}
