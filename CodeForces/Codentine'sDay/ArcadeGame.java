import java.util.ArrayList;
import java.util.Scanner;
// NEED TO FIX FOR SECOND TEST CASE EXCEEDS LIMIT
public class ArcadeGame {

    public static void main(String[] args){
//        int arr[]= new int[3];
//        System.out.println(arr[3]);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[] arr = new int[n];
        while(q-->0){
            int c = scanner.nextInt();
            if ( c ==1 ){
                int l = scanner.nextInt();
                int r = scanner.nextInt(),sum=0;
                for(int i=l;i<=r;i++){
                    sum+=arr[i-1];
                }
                System.out.println(sum);
            }
            else {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int p = scanner.nextInt();
                int k = scanner.nextInt();
                int v = scanner.nextInt();
                for( int i=l;i<=r;i++) {
                    if(i%p==k){
                        arr[i-1]+=v;
                    }
                }
            }
//            System.out.println("Run "+ q+ "for");
//            q--;
        }
    }

}
