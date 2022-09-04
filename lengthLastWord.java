class Solution {
    public int lengthOfLastWord(String s) {
        int p = s.length() -1;
        while (p >= 0 && s.charAt(p)==' '){
            p--;
        }
        int length=0;
        while (p>=0 && s.charAt(p)!= ' '){
            length ++;
            p--;
        }
        return length;

    }
}