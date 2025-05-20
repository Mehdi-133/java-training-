import java.util.Scanner;
public class scanner1 {
    public static void main(String[] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = scanner.nextLine();

        System.out.print("enter your age : ");
        int age = scanner.nextInt();

        System.out.print("what's your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("are you a student? (true/false) ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("hello " + name );
        System.out.println("you are " + age );
        System.out.println("your gpa is  " + gpa);
        
        if(isStudent){
            System.out.println("you are enrolled as a student ");

        }
        else{
            System.out.println("your are  not ......");
        }

        




    scanner.close();


    }


}
