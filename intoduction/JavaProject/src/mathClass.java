import java.util.Scanner;
public class mathClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        /* 
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double results;

        results = Math.pow(2, 3);
       // results = Math.abs(-5);
        results = Math.sqrt(9);
        results = Math.round(3.14);
        results = Math.ceil(6.66);
        results = Math.floor(9.99);
        results = Math.max(10, 20);
        System.out.println(results);

        */

        //  exercice 1 --  HYPOTENUSE = Math,sqrt(a + b)

            double a ;
            double b ;
            double c ;

            System.out.print("enter the length of side A: ");
            a = scanner.nextDouble();

            System.out.print("enter the length of side B: ");
            b = scanner.nextDouble();

           c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

           System.out.println("the hypotenuse (side c ) is :" + c + "cm");

           System.out.println("-------------------------------------------");


           // execrice 2 --- circumference = 2 * Math.PI * radius ;
           // area = Math.PI * Math.pow(radius, 2 );
           // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

            double radius ;
            double circumference ;
            double area;
            double volume;


           System.out.print("eter the radius: ");
           radius = scanner.nextDouble();

           circumference = 2 * Math.PI * radius;
           area = Math.PI * Math.pow(radius, 2);
           volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);


           System.out.printf("the c is: " +   circumference + "cm" );
           System.out.printf("the area is: " + area + "cm" );
           System.out.printf("the volume is: " + volume + "cm");










        scanner.close();


    }

}
