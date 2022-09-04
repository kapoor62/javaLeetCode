class Solution {
    public boolean isPalindrome(String s) {
        int st=0;
        int en = s.length()-1;
        if (s.length()<=1) return true;
        while (st<en){
            while (st<en && !Character.isLetterOrDigit(s.charAt(st))) st++;
            while (st<en && !Character.isLetterOrDigit(s.charAt(en))) en--;
            while (st<en &&  Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(en))) return false;
            st++;
            en--;
        }
        return true;
    }
}