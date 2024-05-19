package LeetCode;

public class ReverseString {

    public void reverseString(char[] s) {
        int size = s.length;
        for( int i=0; i<size/2;i++) {
            char first = s[i];
            s[i] = s[size-i-1];
            s[size-i-1] = first;
        }
    }

}
