import java.util.Scanner;
public class exercice2 {
    public static void main(String[] args) {
        Scanner mehdi = new Scanner(System.in);

        System.out.print("enter your birth day: ");
        int birth = mehdi.nextInt();

        System.out.print("enter the current year: ");
        int current = mehdi.nextInt();

        int age = current - birth ;

        System.out.println("your age is " + age );

        mehdi.close();
    }

}
