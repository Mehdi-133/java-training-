public class strings_methods {
    public static void main(String[] args) {
         
        String name = "password";
/* 
        int lenght = name.length();
        char letter = name.charAt(1);
        int index = name.indexOf("o");
        int lastindex = name.lastIndexOf("o");

         name = name.toUpperCase();
         name = name.toLowerCase();
         name = name.trim();
         name = name.replace("o", "a");

        System.out.println(name.isEmpty());

        
        
        if (name.contains(" ")) {

            System.out.println("your name countains a space ");

            
        }
        else{
            System.out.println("your name doesn't contain any spaces");


        }
            */

            if (name.equalsIgnoreCase("Password ")) {

                System.out.println("your name cant be password ");
                
            }
            else{
                System.out.println("hello " + name );
            }

    }

}
