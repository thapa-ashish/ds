/* Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
 * Array: [1, 3, 2, 6,1, 4, 1, 8, 2], K=5
 */

import java.util.Arrays;

public class MaximumSumSubArray {

    public static void main(String[] args) {

        Integer testArr[] = new Integer[]{2, 1, 5, 1, 3, 2};
        int k = 3;
        int totalSum = Arrays.stream(testArr).limit(3).reduce(0, Integer::sum);
        int windowStart = 0;
        
        for(int i=1 ;i<testArr.length; i++){
            int tempSum = totalSum;

            if(windowStart+k < testArr.length){
                totalSum = totalSum - testArr[i] + testArr[windowStart+k];
                totalSum = totalSum > tempSum ? totalSum : tempSum;
            }
            windowStart++;

        }



        System.out.println(totalSum);

        
    }

    
}


/*
 * arr = {1, 3, 2, 6,1, 4, 1, 8, 2} k = 5
 * 0 to 5 
 * 1 to 1 + 5 = 6
 * A brute force method will be 
 * take int i =0 , then add from i=0 to i<i+k
 * 
 * Sliding window approach
 * 0 to i towards 5
 * 1 to i towards 5 
 * 2 to i towards 5
 * 
 * 
 * arr.length = n
 * for i=0 to n:
 *      if totalSum = totalSum - arr[i] + arr[i+k] 
 *      
 * 
 */
