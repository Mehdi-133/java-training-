public class nested_if_statements {
    public static void main(String[] args) {

       boolean isStudent = false ;
       boolean isSinior = true ;
       double price = 9.99;

       if (isStudent) {

         if (isSinior) {
            System.out.println("you get a sinior discount of 20%");
             System.out.println("you get a student discount of 10%");
            price   *=  0.7;
            
         }

         else{
             System.out.println("you get a student discount of 10%");
        price   *=  0.9;
         }
        
       }
       else{

         if (isSinior) {
             System.out.println("you get a sinior  discount of 20%");
             price   *=  0.8;

           
             }
               else{
                price *= 1 ;
            
         }
       }

       System.out.printf("the price of a ticket is : $%.2f " , price );
        
    }

}
