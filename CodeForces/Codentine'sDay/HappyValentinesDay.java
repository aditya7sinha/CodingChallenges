import java.util.Scanner;
//CODEFORCES Codentine's Day


public class HappyValentinesDay {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0 ; i<n ; i++) {
                arr[i]= sc.nextInt();
            }

            if(valentine(n,arr)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

        public static Boolean valentine(int n, int val[]) {
            int sum=0;
            for( int i=0;i<n;i++) {
                sum+=val[i];
            }
            if(sum==14)
                return true;

            return false;
        }
}
