import java.util.Scanner;

public class miniproject {
      static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        // java banking program for me 

        // declaring variables 
       
        double balance = 0 ;
        boolean isRunning = true;
        int choice ;

        // display menu

        while (isRunning) {
             System.out.println("*****************");
        System.out.println("banking program");
        System.out.println("*****************");
        System.out.println("1. show balance ");
        System.out.println("2. deposit ");
        System.out.println("3. withdraw");
        System.out.println("4. exit the message ");
        System.out.println("*****************");
        // get and process users choice 
        System.out.print("enter your choice(1-4): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> showbalance(balance);
            case 2 ->  balance += deposit();
            case 3 ->  balance -=  withdraw(balance);
            case 4 ->  isRunning = false;
            default -> System.out.println("invalid choice ");
              
        }
        }
       
        // show balance()

        // deposit()

        // withdraw

        // exit message 
        System.out.println("*************************");
        System.out.println("thank you have a nice day");
        scanner.close();
    }
    
   
   
   
    static void showbalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit(){


        double amount;

        System.out.println("Enter a amount to be deposit: ");
        
        amount = scanner.nextDouble();

        if(amount < 0){
           System.out.println("amount cant be negative ");
           return 0;
        }
        else {
            return amount ;
        }
   
        

    }
    
    static double withdraw(double balance){

        double amount ;
        System.out.print("enter a amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("insufficient funds ");
            return 0;
        }

        else if (amount < 0 ){
            System.out.println("amount cant be negative ");
            return 0;
        }
        else{
            return amount ;
        }

      
    }

}

