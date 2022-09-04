class Solution {
    public boolean isPalindrome(int x) {

        if(x<0 || x%10==0 && x!=0){
            return false;
        }

        int reveredNum= 0;
        while(x>reveredNum){
            reveredNum = reveredNum*10 + x%10;
            x /= 10;
        }

        return x==reveredNum || x==reveredNum/10 ;


    }
}