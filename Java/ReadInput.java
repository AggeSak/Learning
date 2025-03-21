import java.util.Scanner;

class ReadInput {

    public static void main(String[] args) {
        System.out.println("Enter your Input: ");
        
        Scanner scanner = new Scanner(System.in);

        //char i = scanner.next().charAt(0);
        String i = scanner.nextLine();
        //scanner.nextLine();
        System.out.println("You entered: " + i + " " );

        scanner.close();

        
    }
}