package Java_IO_Char;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 File sourceFile = new File("/Users/macbookair/Documents/hello.txt");
		 File write_File = new File("/Users/macbookair/Documents/test/heloing.txt");
	

			FileReader readFile = null;
			FileWriter writeFile =null;
			
		
		 try {
			readFile = new FileReader(sourceFile);
			 writeFile = new FileWriter(write_File);
			 
			
			int result;
			while((result = readFile.read()) != -1) {
				
				//System.out.println(result);
				writeFile.write(result);
				
				
			}
			
			
			 System.out.println("Finished");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(readFile != null) {
				 readFile.close();

			}
			
             if(writeFile != null) {
            	 writeFile.close();		
             }
             
		}
		 
		 

	}

}
