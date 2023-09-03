class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        StringBuilder sb=new StringBuilder();
        while(i<word1.length() && j<word2.length()){
           if((sb.length()&1)==0)sb.append(word1.charAt(i++));
           else sb.append(word2.charAt(j++));
        }
        if(i<word1.length())sb.append(word1.substring(i));
        else if(j<word2.length())sb.append(word2.substring(j));
        return sb.toString();
    }
}
