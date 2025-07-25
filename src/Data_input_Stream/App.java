package Data_input_Stream;
//DataInputStream<-BufferedInputStream<-FileInputSteam<-{Data Source}

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		DataInputStream file = null;
   
		try {
				file = new DataInputStream ( new BufferedInputStream(new FileInputStream("/Users/macbookair/Documents/data")));
			
                 System.out.println(file.readUTF());
                 System.out.println(file.readUTF());			
                 System.out.println(file.readInt());			
                 System.out.println(file.readInt());			

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			
			if(file != null) {
				file.close();
			}
			 
			
		}

		
		
		
	}

}
