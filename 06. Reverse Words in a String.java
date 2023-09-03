class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for(int i=s.length()-1;i>=-1;i--){
            if(i==-1 || s.charAt(i)==' '){
                if(ans.length()>0 && ans.charAt(ans.length()-1)!=' ')ans.append(" ");
                ans.append(sb.reverse());
                sb=new StringBuilder();
            }
            else sb.append(s.charAt(i));
        }
        return ans.toString().trim();
    }
}
