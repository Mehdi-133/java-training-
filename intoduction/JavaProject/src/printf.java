public class printf {

    public static void main(String[] args) {
        
        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]

        /* 
        String name = "mehdi";
        char firstletter = 'm';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true; 

        System.out.printf("hello %s\n" , name  );
        System.out.printf("your name start with a  %c\n ", firstletter);
        System.out.printf("%d is my age ", age);
        System.out.printf("your hieght is %g\n thoo ", height );
        System.out.printf("employed: %b\n", isEmployed);


        System.out.printf("%s is %d years old ", name, age );

        */

         

    //---------------------------------------------------------
          //flags
          
         // + = output a plus 
         // , = comma grouping separator
         // ( = negative numbers are enclosed in ()
         // space = display a minus if negative, space if positive 
        double price1 = 9000.99;
        double price2 = 100.15;
        double price3 = -53.01;

        System.out.printf("%+.1f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%(f\n", price3);
        

        //-------------------------------------------------------

        //width

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%d\n", id3);
        System.out.printf("%d\n", id4);












    }

}
