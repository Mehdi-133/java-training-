import java.util.Scanner;
public class calculator2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1 ;
        double num2;
        char operator ;
        double result = 0;
        boolean validoperation = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();


        System.out.print("Enter an operator (+, -, *, /, ): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second  number: ");
        num2 = scanner.nextDouble();


        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("cannot divide by zero");
                    validoperation = false;
                }

                else{
                    result = num1/num2;
                
                }

            }
            default -> {
                System.out.println("invalid");
                validoperation = false;
            }
        }

       if (validoperation) {
             System.out.println(result);
       }













        scanner.close();




    }

}
