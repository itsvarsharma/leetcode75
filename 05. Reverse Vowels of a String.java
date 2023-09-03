class Solution {
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int i=0,j=ch.length-1;
            while(j>i){
                if(vowel(ch[i]) && vowel(ch[j])){
                    swap(ch,i,j); 
                    i++;j--;
                }else if(vowel(ch[i])) j--;
                else if(vowel(ch[j])) i++;
                else{ j--; i++; }
            }
        return new String(ch);
    }

    public boolean vowel(char c){
        return  c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'|| c=='o'||c=='O' || c=='u'||c=='U';
    }
    public void swap(char[] ch, int i, int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
}
