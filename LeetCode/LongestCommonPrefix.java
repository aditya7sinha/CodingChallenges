package LeetCode;

public class LongestCommonPrefix {


    public String longestCommonPrefix(String[] strs) {
        String ans="";
        String firstword = strs[0];
        if(strs.length==1){
            return firstword;
        }
        int numberOfStrings = strs.length;
        for(int i=0;i<firstword.length();i++) {
            for(int j=1;j<numberOfStrings;j++) {
                if(strs[j].length()<i ||firstword.charAt(i) != strs[j].charAt(i)){
                    return ans;
                }
            }
            ans +=firstword.charAt(i);
//            for( int j=0;j<numberOfStrings;j++) {
//                if(strs[i].charAt(j) != firstword.charAt(j)) {
//                    return ans;
//                }
//            }

//            ans+=firstword[]
        }
        return "";
    }


    public static void main(String[] args) {

    }


}
