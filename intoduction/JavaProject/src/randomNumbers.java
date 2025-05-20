import java.util.Random;
import java.util.Scanner;
public class randomNumbers {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        
        //double number;

        //boolean isHeads;

        System.out.print("enter 3 numbers from 1 to 6: ");


        number1 = random.nextInt(1,6);
        number2 = random.nextInt(1,6);
        number3 = random.nextInt(1,6);


        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();

        if (number1 == 1)
        if (number2 == 1)
        if (number3 == 1) {

            System.out.println("you win");
            
        } {
            
        }
           {

            
        }
        
        if (number1 > 1)
        if (number2 > 1 )
        if (number3 > 1 ) {

            System.out.println("your failed ");
            
        } {
            
        } {
            
        }
        
        

       scanner.close();




       
        /* 
        number = random.nextDouble(0,1);
        isHeads = random.nextBoolean();
        if (isHeads) {
            System.out.println("heads");

            
        }
        else{
            System.out.println("tails");
        }

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number);

        */

        






        
    }

}
