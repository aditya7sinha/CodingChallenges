package ICPC2024;

import java.util.ArrayList;
import java.util.Scanner;
// options
//Operation 1: Choose a particular proton, and then insert two antiprotons, one to its left and the other
//        to its right. This has the effect of replacing the corresponding character P in the state string with
//        APA.
//        Operation 2: Choose a particular antiproton, and then insert two protons, one to its left and the other
//        to its right. This has the effect of replacing the corresponding character A in the state string with
//        PAP.
//        Operation 3: Choose a contiguous subsequence of a antiprotons, and then remove them.
//        Operation 4: Choose a contiguous subsequence of p protons, and then remove them.

public class AntiParticleAntithesis {
    private static ArrayList<String> antiPhysics(String s, String e, int a, int p){
        ArrayList<String> operations = new ArrayList<>();

        return operations;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int p = sc.nextInt();
            String s = sc.next();
            String e =sc.next();
            ArrayList<String> operations = antiPhysics(s, e, a, p);
            if(operations == null){
                System.out.println(-1);
            }
            else {
                System.out.println(operations.size());
                for(String operation: operations){
                    System.out.println(operation);
                }
            }
        }
    }
}
