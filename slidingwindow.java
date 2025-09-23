Sliding window: Time comlexity: O(n) : MAX SUM OF SUBARRAY WITH SIZE K
-------------------------------------
It is an algorithm which makes use of the computed values to perform next computation.
Code Reusability in an efficient manner
Mainly used for subarrays and substring problems

Kadanes Algorithm: MAX SUM OF SUBARRAY O(N)
------------------
Kadane’s Algorithm is a dynamic programming approach used to find the maximum sum of a contiguous subarray in an array of integers (which can include negative numbers).
class Solution {
    int maxSubarraySum(int[] arr) {
        int sum = 0; 
        int maxsum = Integer.MIN_VALUE; // very small value
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            sum += arr[i];   // add current element to running sum

            if (sum < 0) {   // if sum goes negative, reset it
                sum = 0;
            }

            if (sum > maxsum) {  // update maximum sum found so far
                maxsum = sum;
            }
        }
        return maxsum;
    }
}
(the above code is for array with mixed / full positive integers)
  
