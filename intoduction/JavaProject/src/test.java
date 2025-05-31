import java.util.Scanner;
public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String name ;
        int age ;
        boolean pro = true;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        




        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age >= 12 ) {

            System.out.println("you can sign");
              System.out.print("are you a player: (true/false)");
              pro = scanner.nextBoolean();
              if (true ) {

                System.out.println("your welcome");


                
              }
             
                
            }
            
        
        else{
            System.out.println("you should be 12 first ");
        }


      

      




        
    }

}
