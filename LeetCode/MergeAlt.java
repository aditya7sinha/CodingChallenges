package LeetCode;

public class MergeAlt {
    public String mergeAlternately(String word1, String word2) {
        String newWord = new String();
        int len = (word1.length() > word2.length()) ? word1.length() : word2.length();
        int p1=0,p2=0;
        for(int i = 0; i < len ; i++) {
            if(p1<word1.length()) {
                newWord = newWord + word1.charAt(p1);
                p1++;
            }
            if(p2<word2.length()) {
                newWord = newWord + word2.charAt(p2);
                p2++;
            }
        }
        return newWord;
    }

    public static void main(String[] args){
        String w1="abc", w2="pqrs";
        MergeAlt mergeAlt = new MergeAlt();
        System.out.println(mergeAlt.mergeAlternately(w1, w2));
    }
}
