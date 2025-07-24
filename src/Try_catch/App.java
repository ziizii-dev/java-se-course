package Try_catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        File file = new File("/Users/macbookair/Documents/hello.txt");
        Scanner scan = new Scanner(System.in); // Corrected from System.int

        try {
            Scanner fileScanner = new Scanner(file);
            
            while (fileScanner.hasNextLine()) {
            	
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (FileNotFoundException e) { // Proper exception handling
            System.out.println("File not found: " + e.getMessage());
        }

        scan.close(); // Close the scanner
    }
}
