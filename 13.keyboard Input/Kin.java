import java.io.IOException;

/***
 * 
 * Detect the Keyboard input from java
 * 
 */


 class Kin{
     public static void main(String[] args)  throws IOException{
        char ch; // character from Keyboard

         System.out.println("Please Enter any Key");
         ch = (char) System.in.read();
         System.out.println("Your character was " + ch);

     }
 }