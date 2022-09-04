class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        // BRUTE FORCE APPROACH:
        //time O(n^2)
        //space  O(n)
        //    int count =0;
        //  int[] result = new int[nums.length];
        //  for (int i =0; i<nums.length; i++){
        //      int count =0;       // needs to declared inside for loop.
        //      for (int j =0; j<nums.length;j++){
        //       if ( nums[j]< nums[i] && i!=j)
        //           count ++;
        //      }
        //     result [i]= count;
        //  }
        // return result;


        /*--------OPTIMISED AAPPROACH---------------*/
        //index of array used as nums [i] values- optimised
        int[] temp = new int[101];
        int [] res = new int [nums.length];

        //frequency is stored:
        for (int i=0; i< nums.length; i++){
            temp [nums[i]]++;
        }

        //runnung sum:- gives no of elements smaller than current no
        for (int i=1; i<101; i++){
            temp[i]+= temp[i-1];
        }

        //result:
        for (int i=0; i< nums.length; i++){
            if (nums[i]== 0)
                res[i]=0;
            else
                res[i] = temp[nums[i]-1];

        }

        return res;
    }
}