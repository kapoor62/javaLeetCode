class Solution {
    public String removeVowels(String s) {
        Set <Character> vowels = new HashSet <>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        char[] ch = s.toCharArray();
        StringBuilder result = new StringBuilder("");
        for (char c: ch){
            if (!vowels.contains(c))
                result.append(c);
        }
        return result.toString();

    }
}