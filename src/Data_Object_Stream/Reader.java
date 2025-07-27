package Data_Object_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reader {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ObjectInputStream file = null;

        try {
            file = new ObjectInputStream(
                    new FileInputStream("/Users/macbookair/Documents/Student/students.bin"));
        Students [] studentArray = (Students []) file.readObject();
        for(Students student:studentArray) {
        	
        	System.out.println(student.getId()+" "+student.getName());
        	
        	
        }
          

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
