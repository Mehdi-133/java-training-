import java.util.Scanner;
public class subStrings {
    public static void main(String[] args) {
        
       

        // .subString() = A method used to extract a portion of a string 
        //         string.substring(start, end )

        Scanner scanner = new Scanner(System.in);
        String email;
        String username;
        String domain ;
        

        System.out.print("Enter your email: ");


       email = scanner.nextLine();

       if (email.contains("@")) {

       username = email.substring(0, email.indexOf("@"));
       domain = email.substring(email.indexOf("@"  ) + 1 );
        
       System.out.printf("the user name is %s\n ", username);
       System.out.printf("the domain is %s\n " ,domain);

        
       }
       else{
        System.out.println("email must contain @ ");
       }


       //////////////////////////////////////////////////////////////////////
       
      
       






       
        
        

        



    scanner.close();
    }  

}   

    



