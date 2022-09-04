class Solution {
    public int mostWordsFound(String[] sentences) {
        int count =0;
        int max =0;
        for (String s: sentences){
            String [] words = s.split(" ");
            count = words.length;
            if (count > max)
                max = count;
        }

        return (max);
    }
