class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i = n-1; i>=0 ; i--){
            if (digits[i]== 9){
                digits[i]=0; // not returning anything here, hence in this case it goes out of the above for loop to return something.
            }
            else{
                digits[i]++;
                return digits;

            }
        }
        digits = new int [n+1];
        digits[0]=1;
        return digits;


    }
}