import java.util.*;
import java.lang.*;
import java.io.*;

public class Streak {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int count = 0;
            int maxCount = 0;

            for (int i = 0; i < N; i++) {
                if (A[i] > 0) {
                    count++;
                    maxCount = Math.max(maxCount, count);
                } else {
                    count = 0;
                }
            }

            System.out.println(maxCount);
        }
    }

}
