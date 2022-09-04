class Solution {
    public int[] runningSum(int[] nums) {

     

        //METHOD 1 BRUTE FORCE WUTH TWO NESTED FOR LOOPS:
        // TIME: O(N^2)

        //METHOD 2: TIME: O(N) N SPACE : 0(N)- due to result array
//         int n = nums.length;
//         int result [] = new int [n];
//         result[0] = nums[0];
//         for (int i=1; i< n; i++){
//            result[i] = result[i-1]+nums[i];

//         }
//   return result;


        //METHOD3: OPTIMISED:
        //TIME: O(N) N SPACE : 0(1)

        for (int i=1; i< nums.length; i++){
            //nums [i]  = nums[i]+ nums[i-1];
            nums[i] += nums[i-1];
        }
        return nums;

    }
}