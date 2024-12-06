
public class multi_dim_array_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] numbers = {{20,30},{29,40},{290,890} };
	
		for(int i=0;i<numbers.length;i++) {
			System.out.println("****");
			for(int j=0; j< numbers[i].length;j++) {
				System.out.println(numbers[i][j]);
			}
		}

	}

}

