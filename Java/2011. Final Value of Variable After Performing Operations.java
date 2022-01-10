//2011. Final Value of Variable After Performing Operations

class Solution {
    public int finalValueAfterOperations(String[] o) {
       String s;
        int x=0;
        for(int i=0;i<o.length;i++){
            s=o[i];
            if(s.contains("++")){
                x=x+1;
            }
            else {
                x=x-1;
            }
        }
        return x;
    }
}