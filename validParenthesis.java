class Solution {
    public boolean isValid(String s) {
        HashMap <Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');



        //logic: whn we get open bracket - push open bracket to stack
        // close bracket: check with top of stack
        Stack <Character> stack = new Stack<Character> ();
        for (char c : s.toCharArray()){
            if (map.containsKey(c))   // for open- push
                stack.push(c);

            else  {
                if (stack.isEmpty())
                {return false; } //close bracket, stack - empty=>no open -false
                char open = stack.pop();
                if (map.get(open)!=c){
                    return false;
                }

            }

        }
        return stack.isEmpty();


    }
}