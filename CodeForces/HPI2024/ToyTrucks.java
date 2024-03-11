package HPI2024;

import java.util.Scanner;

public class ToyTrucks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valL = sc.nextInt();
        if(valL<=10){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
