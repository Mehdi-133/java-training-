import java.util.Random;
import java.util.Scanner;


public class gussingnumbers {
    public static void main(String[] args) {
        

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min =  1 ;
        int max = 100;
        int randomnumber = random.nextInt(min,max + 1 ) ;
        
        System.out.println("number guessing game ");
        System.out.printf("guess a number between %d-%d:\n  " ,min , max);

        do{
            System.out.print("enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomnumber) {
                System.out.println("too low try again");
            }
            else if (guess > randomnumber){
                System.out.println("too high try again");
            }
            else{
                System.out.println("Correct the number was a "+ randomnumber  );
                System.out.println(" # of attempt " + attempts );
            }

        }while(guess != randomnumber );
         
        System.out.println("you have won");
    }

}
