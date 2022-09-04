class Solution {
    public String sortSentence(String s) {
        Map <Integer, String> result = new HashMap<>();
        // String [] words = s.spilt("");  //gives all the words in sentence in array words

        for (String word : s.split(" ")){

            /// identifies the last index => gives the index to get word position
            int lastIndex =  word.length() -1;

            /// getting the last index of the word = position
            int index = word.charAt(lastIndex) - '0';
            // implicit char to int casting

            ////getting the actual word:
            String actualWord = word.substring (0, lastIndex);

            //putting index n word in map
            result.put(index, actualWord);

        }

        StringBuilder actualString = new StringBuilder ();

        //travesring map to get result:
        for (Map.Entry<Integer, String> i: result.entrySet()){
            actualString.append (i.getValue());
            actualString.append (" ");

        }
        return actualString.toString().trim();


    }
}