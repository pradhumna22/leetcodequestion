//1929. Concatenation of Array

class Solution {
    public int[] getConcatenation(int[] nums) {
        int c=nums.length;
        int a[]=new int [c+c];
        
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
            a[c]=nums[i];
            c++;
        }
        return a;
    }
}