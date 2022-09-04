class Solution {
    public String reverseWords(String s) {
        int i=0;
        int n = s.length();
        String result = "";

        while (i<n){
            while(i<n && s.charAt(i)==' ') i++;
            if (i>=n) break; // for last space
            int j= i+1;
            while (j<n && s.charAt(j) !=' ') j++;
            String word = s.substring(i,j);
            if (result.length()==0) result= word; //for first word
            else result = word +' ' + result;
            i = j+1;

        }
        return result;




    }
}