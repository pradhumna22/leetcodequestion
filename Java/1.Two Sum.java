//Quesestion One
//1 Two Sum


class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        int arr[]=new int [2];
        for(int i=0;i<nums.length;i++){
        for(int j=1+i;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                arr[0]=i;
                arr[1]=j;
                break;
            }
        }
        }
            return arr;
    }
}