import java.io.*;

public class CheckFile {
    public static void main(String[] args) {
        
        checkFile("filename.txt");
        }
    
public static void checkFile(String filename) {
    File myObj = new File(filename);
    if (myObj.exists()) {
        System.out.println("File name: " + myObj.getName());
        System.out.println("Absolute path: " + myObj.getAbsolutePath());
        System.out.println("Writeable: " + myObj.canWrite());
        System.out.println("Readable: " + myObj.canRead());
        System.out.println("File size in bytes: " + myObj.length());
    } else {
        System.out.println("The file does not exist.");


    }
    try {
            // Open the file for reading
            FileReader reader = new FileReader(filename);
            int c; // To store each character

            while ((c = reader.read()) != -1) { // Read character by character
                if (Character.isDigit(c)) {
                    System.out.println((char) c + " is a number.");
                } 
                //else {
                //    System.out.println((char) c + " is NOT a number.");
                //}
            }
            reader.close(); // Close the file

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
}
}
}
