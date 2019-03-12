/*****
 * 
 * Conversion From inches to meter
 * 
 */

 class inches{
     public static void main(String[] args) {
         double inches, meters;
         int counter = 0;

         //looping
         for(inches=1; inches<=144; inches++){
             meters = inches * 39.37;
             System.out.println("Inches " + inches + " meters " + meters );
             counter ++;
             
             //end after 12th line

             if(counter == 12){
                 System.out.println();
                 counter = 0; //counter reset
             }
         }

     }
 }