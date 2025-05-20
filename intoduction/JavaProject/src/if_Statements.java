import java.util.Scanner;
public class if_Statements {

    public static void main(String[] args) {

        // performe a block of code if its condition is true 
        
        Scanner scanner = new Scanner(System.in);

        int age ;
        String name ;
        boolean isStudent;

        System.out.print("enter your name: ");
            name = scanner.nextLine();

        System.out.print("enter your age: ");
           age = scanner.nextInt();

        System.out.print("are you a student(true/false) ");
           isStudent = scanner.nextBoolean();


            // group1

            if (name.isEmpty()) {
                System.out.println("you didn't enter your name");
                
            }

            else{
                System.out.println("hello " + name  );

            }


                // group3

                if (isStudent) {

                    System.out.println("you are a student ");
        
                }

                else{
                    System.out.println("you are not a student ");
                }


               // group2

         if (age >= 18 ) {
            System.out.println("you are able to vote ");
            
         }



         else if (age<= 18) {

            System.out.println(" you are not be able to vote ");
            
         }

         
         


         

          




         scanner.close();

    }
}
