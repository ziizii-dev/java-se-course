
public class return_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int result= calculate(12,20);
		System.out.println(result);
		String result1= names("Mg mg");
		System.out.print(result1);
	}
	public static int calculate(int x, int y) {
		int area = x * y;
		return area;
		
	}
 public static String names(String name) {
//	 String result = names;
	 return name;
 }
	
}
