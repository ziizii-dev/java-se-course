package Data_Object_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writer {

    public static void main(String[] args) throws IOException {
        // Create 3 student objects
        Students s1 = new Students(1, "Su Su");
        Students s2 = new Students(2, "Aye Aye");
        Students s3 = new Students(3, "Hla Hla");
        Students s4 = new Students(4, "Hla Mya");
        
        
        Students [] students = {s1,s2,s3,s4};
   

        ObjectOutputStream file = null;

        try {
            file = new ObjectOutputStream(
                    new FileOutputStream("/Users/macbookair/Documents/Student/students.bin"));
            
           
              file.writeObject(students);
            System.out.println("Finished.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                file.close();
            }
        }
    }
}
