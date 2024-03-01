package LeetCode;

import java.util.Scanner;
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        //Another Way
//        int count = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) == ' ') {
//                if (count > 0) {
//                    break;
//                }
//            } else {
//                count++;
//            }
//        }
//        return count;
//    }   int count = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) == ' ') {
//                if (count > 0) {
//                    break;
//                }
//            } else {
//                count++;
//            }
//        }
//        return count;
//    }
        String[] words = s.split(" ");
        String w = words[words.length -1];
        return w.length();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        LengthOfLastWord word =  new LengthOfLastWord();
        System.out.println(word.lengthOfLastWord(sen));

    }
}
