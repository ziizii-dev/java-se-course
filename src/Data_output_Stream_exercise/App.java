package Data_output_Stream_exercise;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		
		String [] products = {"GUCCI","Pansonic","Camera"};
		
		int [] prices = {400,900,500};
		
		DataOutputStream file = null;
		
		 try {
				file = new DataOutputStream ( new BufferedOutputStream(new FileOutputStream("/Users/macbookair/Documents/productlists")));
				
			for(int i =0; i<products.length;i++) {
				
				file.writeUTF(products[i]);
				file.writeInt(prices[i]);
				
				
			}
				System.out.println("Finished.");
				
			  } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			  }finally{
				 if(file != null) {
					 
					 file.close();
					 
				 }
				  
				  
			  }
	
		
		
		

	}

}
