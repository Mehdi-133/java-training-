import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        
        // enhancing switch = a replacement to many if statements
        //                        (java14 features)

        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Enter a day from the week:  ");
        String day = scanner.nextLine();

        switch (day) {
            case "monday" -> System.out.println("its a shoulders day");
            case "tuesday" -> System.out.println("its a legs day ");
            case "wednesday " -> System.out.println("rest day ");
            case "thursday" -> System.out.println("chest day");
            case "friday" -> System.out.println("back day");
            case "saturday" -> System.out.println("arms day");
            case "sunday" -> System.out.println("running day ");

            default -> System.out.println("not a day");

           

           





           

                
              
        }



        
       

}

        







       
    }


