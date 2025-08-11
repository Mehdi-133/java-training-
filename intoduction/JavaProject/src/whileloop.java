import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        
        // while loop = repeat some code forever while some conditions remains true 

    
    Scanner scanner = new Scanner(System.in);
    
    /*String name = "" ;
   
        
    while (name.isEmpty()) {

        System.out.println("Enter your name: ");
        name = scanner.nextLine();
    }

    System.out.println("hello  " + name );

    String response = "" ;

    while (!response.equals("Q")) {
        System.out.println("you are playing a game ");
        System.out.print("press q to quit: ");
        response = scanner.next().toUpperCase();
    }

    System.out.println("you have quit the game ");

    
    int number = 0 ;
   
    do{
        System.out.println("invalid ");
        System.out.print("enter a positive number: ");
        number = scanner.nextInt();
    }while (number <= 0 ) ;
    System.out.println("thats right ");

    /* */

     int number = 0;
    do {
      
        System.out.print("Enter a number between 1 - 10: ");
        number = scanner.nextInt();
     }while (number < 1 || number > 10 );
    System.out.println("you picked " + number);
    scanner.close();
    }

}
