package Java_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 File sourceFile = new File("/Users/macbookair/Documents/hello.txt");
		 File write_File = new File("/Users/macbookair/Documents/test.txt");
		 File readPhotoFile = new File("/Users/macbookair/Documents/rs1.jpeg");
		 File writePhotoFile = new File("/Users/macbookair/Documents/test/test.jpeg");


			FileInputStream readFile = null;
			FileOutputStream writeFile =null;
			FileInputStream readPhotoFile1 = null;
			FileOutputStream writePhotoFile1 =null;
		
		 try {
			readFile = new FileInputStream(sourceFile);
			 writeFile = new FileOutputStream(write_File);
			 readPhotoFile1 = new FileInputStream(readPhotoFile);
			 writePhotoFile1 = new FileOutputStream(writePhotoFile);
			
			int result;
			while((result = readFile.read()) != -1) {
				
				//System.out.println(result);
				writeFile.write(result);
				
				
			}
			int photoResult;
			int i =0;
			while((photoResult = readPhotoFile1.read()) != -1) {
				writePhotoFile1.write(photoResult);
				i++;
				
				
			}
			System.out.println("File Size is"+" " + i+" " + "Bytes");
			
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
             if(readPhotoFile1 != null) {
            	 readPhotoFile1.close();

			}
			
             if(writePhotoFile1 != null) {
            	 writePhotoFile1.close();		
             }
		}
		 
		 

	}

}
