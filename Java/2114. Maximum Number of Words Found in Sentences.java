//2114. Maximum Number of Words Found in Sentences

class Solution {
    public int mostWordsFound(String[] s) {
       int A=0;
        for(int i=0;i<s.length;i++){
           String a=s[i];
           int mx=countWords(a);
            if(mx>=A){
                A=mx;
            }
       }
        return A;
    }
    public int countWords(String s){
    int wordCount = 0;
    boolean word = false;
    int endOfLine = s.length() - 1;
    for (int i = 0; i < s.length(); i++) {

        if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
            word = true;
        } else if (!Character.isLetter(s.charAt(i)) && word) {
            wordCount++;
            word = false;
        } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
            wordCount++;
        }
    }
    return wordCount;
}
}