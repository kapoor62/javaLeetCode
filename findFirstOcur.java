class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;

        int hL = haystack.length(), nL = needle.length();
        for (int i=0; i< hL- nL+1; i++){
            if (haystack.substring (i, i+nL).equals(needle))
                return i;

        }
        return -1;
    }
}