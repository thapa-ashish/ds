public class ReverseInteger {

    public static void main(String args[]){

        int test = 156789;

        /*
         * rev = 0
         * rem = x % 10 = 1
         * 
         * rev = ( rev * 10 ) + rem 
         *  
         * x = x/ 10
         *  
         * 
         *  
         *  
         *  
         * 
         * 
         * 
         * 
         */

        int rem = 0;
        int rev = 0;
        while( test > 0) {

            rem = test % 10;
            rev = (rev * 10 ) + rem;

            test = test / 10;

        }

        System.out.println(rev);
    }
    
}
