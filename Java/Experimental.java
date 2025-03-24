import java.util.Scanner;
import java.io.*;

class Experimental {

    public static void main(String args[]){

        Scanner scanning = new Scanner(System.in); 
        System.out.println("Give me input:");

        String in = scanning.nextLine(); 

        takeInput obj = new takeInput(in);
        //takeInput.take(in);
        obj.result();

        checkInput obj1 = new checkInput("filename.txt", "aggelos");

        obj1.find();

        scanning.close(); 


    }
}

class takeInput{

   private String Input;
   private String wordtofind;

   //Constructor
   // Constructor (Special method to initialize objects)
    public takeInput(String Input) {
        this.Input = Input;
        
    }
    
    public void result() {
        System.out.println(Input + " Again");
    }
}

// A class that checks if input exist in txt File
class checkInput {

    String filepath;
    String wordToFind;
    boolean found = false;
    //Constructor 
    public checkInput(String filepath,String wordToFind){
        this.filepath = filepath;
        this.wordToFind = wordToFind;
    }

   public void find(){
   try { 
    FileReader fr = new FileReader(filepath);
    BufferedReader br = new BufferedReader(fr); 
        
        String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(wordToFind)) {  
                    found = true;
                    System.out.println("I found it");
                    break;  
                }
   }        if(!found){System.out.println("Not here");}    
   }
   
   catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
   }}




}