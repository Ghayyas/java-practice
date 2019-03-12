/****
 * 
 * 
 * Compute the number of cubic inches
 *      in 1 cubic mile.
 * 
 * 
 */

 class inches{
     public static void main(String[] args) {
         long ci;
         long im;
         
         im =  5280 * 12;
         ci = im * im * im;
         System.out.println("There are " + ci + " Cubic inches in cube mile.");
     }
 }