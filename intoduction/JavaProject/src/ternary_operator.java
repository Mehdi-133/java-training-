import java.util.Scanner;
public class ternary_operator {
    public static void main(String[] args) {

        // ternary operator = return 1 of 2 values if = conditions is true 

        // variables = (conditions ) ? ifTrue : ifFalse 
         
        Scanner scanner = new Scanner (System.in);

        int number  ; 
        System.out.print("enter an number: ");
        number = scanner.nextInt();
        String  evenOrOdd = (number % 2 == 0 ) ? "even" : "odd" ;
        

        System.out.println("the number " + number+ " is "  +  evenOrOdd);

        int hours = 13;
        String timeOfDay = (hours < 12 ) ?  "A.M" : "P.M ";
        System.out.println(timeOfDay);

        int  income = 60000 ;
        System.out.print("enter your income: ");
        income = scanner.nextInt();
        double taxRate = (income >= 2000) ? 1.2 : 2.2 ;
        System.out.println(taxRate);

        int age = 8;
        String voiding = (age >= 18) ? "adult" : "not adult " ;
        System.out.println(voiding);


       scanner.close();

    }

}
