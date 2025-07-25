package Data_output_Stream;
//DataoutputStream->BufferedOuptutStream->FileOutputSteam->{Data Source}

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		DataOutputStream file  = null;
             
		
		  try {
			file = new DataOutputStream ( new BufferedOutputStream(new FileOutputStream("/Users/macbookair/Documents/data")));
			
			file.writeUTF("Apple");
			file.writeUTF("Banana");

			file.writeInt(500);

			file.writeInt(800);
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
