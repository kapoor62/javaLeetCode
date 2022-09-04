class Solution {
    public int numIdenticalPairs(int[] nums) {
        // BRUTE FORCE APPORACH:
        //time compexity: O(n^2)

//         int count =0;
//         for (int i =0; i< nums.length; i++){
//             for (int j =i+1; j<nums.length; j++){
//                 if (nums[i]==nums[j])
//                     count++;

//             }
//         }
//         return count;


        int count =0;
        int [] freq = new int [101];
        for (int num:nums)
            count += freq[num]++;
        return count;

    }
}