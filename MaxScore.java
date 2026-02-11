import java.util.*;
import java.lang.*;
import java.io.*;

class MaxScore
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-- > 0){
            int N = sc.nextInt();
            
            int[] A = new int[N];
            int[] B = new int[N];
            
            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }
            
            for(int i = 0; i < N; i++){
                B[i] = sc.nextInt();
            }
            
            int totalWins = 0;
            int minPenalty = Integer.MAX_VALUE;
            
            for(int i = 0; i < N; i++){
                totalWins += A[i];
                minPenalty = Math.min(minPenalty, A[i] - B[i]);
            }
            
            int result = totalWins - minPenalty;
            System.out.println(result);
        }
    }
}

