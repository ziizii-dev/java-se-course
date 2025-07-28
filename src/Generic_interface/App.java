package Generic_interface;

public class App {

	public static void main(String[] args) {
		Pair<Integer,String> pair = new CustomPair<>(12,"Hello World");
		System.out.println(pair.getKey()+" : "+pair.getValue());
		
	}

}
