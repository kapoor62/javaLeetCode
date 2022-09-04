class Solution {
    public int balancedStringSplit(String s) {
        int r=0;
        int l=0;
        int sub=0;

        char[] ch = s.toCharArray();
        for (int i=0; i<ch.length; i++){
            if (ch[i]== 'R')  r++;
            else l++;
            while (l==r && l!=0 && r!=0){
                sub ++;
                l=0;
                r=0;
            }

        }
        return sub;

    }
}