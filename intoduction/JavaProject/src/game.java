import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        // MAD LIBS GAME 


        Scanner scanner = new Scanner(System.in);

        String adjc1;
        String noun1;
        String adjc2;
        String verb1;
        String adjc3;

        System.out.print("enter an adjctive (description): ");
        adjc1 = scanner.nextLine();
        System.out.print("enter an noun (animal or person):");
        noun1 = scanner.nextLine();
        System.out.print("enter an adjctive (description): ");
        adjc2 = scanner.nextLine();
        System.out.print("enter a verb ( end with ing ):");
        verb1= scanner.nextLine();
        System.out.print("enter an adjctive (description): ");
        adjc3 = scanner.nextLine();

        System.out.println("today i went to a " + adjc1 +  " zoo. ");
        System.out.println("in an exibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjc2 + " and " + verb1 +  " . ");
        System.out.println(" i was " + adjc3+ " !");


        scanner.close();




    }

}
