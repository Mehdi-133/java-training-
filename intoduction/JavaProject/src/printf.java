public class printf {

    public static void main(String[] args) {
        
        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]


        String name = "mehdi";
        char firstletter = 'm';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true; 

        System.out.printf("hello %s\n" , name  );
        System.out.printf("your name start with a  %c\n ", firstletter);
        System.out.printf("%d is my age ", age);
        System.out.println("your hieght is %g\n ");







    }

}
