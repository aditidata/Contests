import java.util.*;
import java.lang.*;
import java.io.*;

class AllEven
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-- > 0){
            int N = sc.nextInt();
            int[] A = new int[N];
            
            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }
            
            // simulate parity merging from right
            int parity = A[N-1] % 2;  // current merged block parity
            
            for(int i = N-2; i >= 0; i--){
                parity = (parity + (A[i] % 2)) % 2;
            }
            
            if(parity == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
