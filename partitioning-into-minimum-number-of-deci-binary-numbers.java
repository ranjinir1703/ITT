class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(char c:n.toCharArray()){
            int digit=Character.getNumericValue(c);
        
        if(digit>max)
            max =digit;
        }
        return max;
    }
}