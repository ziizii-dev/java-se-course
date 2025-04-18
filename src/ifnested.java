
public class ifnested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 90;
		if(mark >= 0 && mark <= 100) {

			
			if (mark >= 80) { 
				System.out.println("Pass with Destiction");
			}
			else if(mark >= 40) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
		}else {
			System.out.print("Wrong input");
		}

	}

}
