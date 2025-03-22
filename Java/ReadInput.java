import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class ReadInput {

    public static void main(String[] args) {
        System.out.println("Enter your Input: ");
        
        /*
        Scanner scanner = new Scanner(System.in);

        //char i = scanner.next().charAt(0);
        String i = scanner.nextLine();
        //scanner.nextLine();
        System.out.println("You entered: " + i + " " );
        */
        

        System.out.println("Enter your second Input: ");
        
          try { 
            String j = getUserInput();
            System.out.println("You entered: " + j);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Enter your third Input: ");
        int k = getInput();
        System.out.println("You entered: " + k);
    }

public static String getUserInput() throws IOException {
		
		// InputStreamReader: Reads bytes from Standard Input and Decodes them into characters
		// BufferedReader: Buffers the characters - Enable efficient reading of text data
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 

		// Read a line of text
		final String line = reader.readLine(); 
        
		return line;


	}

public static String getInput() {
    final DataInputStream in = new DataInputStream(System.in);
    
    final int i = in.readInt();

    return i;


}

}

