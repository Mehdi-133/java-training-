import java.util.Scanner;
public class exercice1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your age: ");
        int age = scanner.nextInt();

        if(age<18){
            System.out.println("you are " + age);
            System.out.println("you are not aloud to vote");

        }
        else{
            System.out.println("you are able to vote ");
        }

        scanner.close();

    }

}
