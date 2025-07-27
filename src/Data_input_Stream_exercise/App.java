package Data_input_Stream_exercise;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
        
		DataInputStream file = null;
		   
		try {
				file = new DataInputStream ( new BufferedInputStream(new FileInputStream("/Users/macbookair/Documents/productlists")));
			
                try{
    				while(true) {
    					String name = file.readUTF();
    					int price = file.readInt();
    					System.out.println(name + "-" + price);
    					
    				}
	
                	
                	
                }catch(EOFException e) {
                	
                	System.out.println("Finished");
                	
                	
                }

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			
			if(file != null) {
				file.close();
			}
		
		
		
	}

}
}
