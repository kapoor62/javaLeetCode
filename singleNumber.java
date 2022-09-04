class Solution {
    public int singleNumber(int[] nums) {
        List <Integer> no_dups  = new ArrayList<>();
        for (int i:nums){
            if (!no_dups.contains(i))
                no_dups.add(i);
            else
                no_dups.remove(new Integer(i));
        }
        return no_dups.get(0);

    }
}