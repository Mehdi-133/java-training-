import java.util.Scanner;
public class tempConverter {

    public static void main(String[] args) {

        

        Scanner scanner = new Scanner(System.in);

        double temp ;
        double newtemp;
        String unit;
        
        System.out.print("Enter the temp: ");
        temp = scanner.nextDouble();


        System.out.print("convert to Celsius or Fahrenheit? (c or f)  ");
        unit = scanner.next().toUpperCase();

        // (condition ) ? true : false 

        newtemp = (unit.equals("C")) ? (temp - 32 ) * 5 / 9 : (temp * 5 / 9) + 32 ;

        System.out.printf( " the new temp is %.2f° %s   ", newtemp, unit );








        

        scanner.close();

    }
}
