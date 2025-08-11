public class Strings_method {
    public static void main(String[] args) {

     String name = "         mehdi karbitou";
     int lenght =  name.length();
     char letter = name.charAt(1);
     int index = name.indexOf("i");
     int lastindex = name.lastIndexOf("m");
     System.out.println(lastindex);


     name = name.trim();
     System.out.println(name.isEmpty());
        
    }

}
