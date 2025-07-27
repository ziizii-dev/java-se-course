package Data_byte_Streams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		
		 File read_File = new File("/Users/macbookair/Documents/test/test.txt");
		 File write_File = new File("/Users/macbookair/Documents/test/output/test.txt");
		
		 try(FileInputStream readFile = new FileInputStream(read_File);
				 FileOutputStream writeFile = new FileOutputStream(write_File)){
		
		
			int result;
			int i =0;
			while((result = readFile.read()) != -1) {
				writeFile.write(result);
				i++;
				
				
			}
			System.out.println("File Size is"+" " + i+" " + "Bytes");
			
			 System.out.println("Finished");
			
			
		} catch (FileNotFoundException e) {
						e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		 

	}

}
