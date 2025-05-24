import java.util.Scanner;
public class weightConverter {
    public static void main(String[] args) {
        
        //weight converter program 

        // declare variables

        Scanner scanner = new Scanner(System.in);

        double weight ;
        double newWeight;
        int choice ;


        //welcome message 

        System.out.println("weight converter program");
        System.out.println("1 : convert lbs to kgs");
        System.out.println("2 : convert kgs to lbs");



        // prompt for user choise 

        System.out.print("choose an option: ");
        choice = scanner.nextInt();

        //option 1 : convert lbs to kgs 

        if (choice == 1 ) {

            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("the new weight in kgs is %.2f\n " , newWeight);
            
        }

        //option 2 : convert kgs to lbs 


        
        if (choice == 2 ) {

            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("the new weight in lbs is %.2f\n " , newWeight);



         }
        // else print not a valid choice 

            else{
                System.out.println("that was not  a valid choise ");
            }

   

        scanner.close();
   }


}
