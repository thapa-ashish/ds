/*
* Input: s = "babad"
* Output: "bab"
* Explanation: "aba" is also a valid answer.
 */


public class SlidingWindow {

    public static void main(String[] args) {
        
        String inputString = "abba";

        /*
         *  babad 
         *  
         *  for(i till first palindrome found )
         */
        
         boolean result = isPalindrome(inputString);
         System.out.println(result);

        
    }


    public static boolean isPalindrome(String test){
        char[] testStringArr = test.toCharArray();
        int j = testStringArr.length - 1;


        for(int i=0; i<testStringArr.length; i++){
            if(testStringArr[i] != testStringArr[j]){
                return false;
            }
            j--;
        }
        return true;
    }
    
}
