/**
 * 
 * 
 * Calculate the integer power of 2
 * 
 */


 class power{
     public static void main(String[] args) {
       int e,result;
       for(int i=0; i<10;i++){
           result = 1;
           e =i;  // e= 2
        //    System.out.println(result+" pre "+e);

           while(e > 0){
            System.out.println(result+" "+e);

            result*=2; //2= 2*2
            // System.out.println(result+" "+e);

            e--;//2-1 = 1
            // System.out.println(result+" "+e);

           }
        //    System.out.println(result+" "+e);

       }
     }
 }