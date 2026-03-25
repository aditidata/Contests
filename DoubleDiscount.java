
    import java.util.*;
public class DoubleDiscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] A = new int[N]; 
            int[] B = new int[N]; 

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }

            int maxTaste = 0;

            // check all pairs
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {

                    int cost1 = A[i];
                    int cost2 = A[j];

                    int totalCost;

                    if (cost1 > cost2) {
                        int discount = Math.min(100, cost1 / 2);
                        totalCost = (cost1 - discount) + cost2;
                    } else {
                        int discount = Math.min(100, cost2 / 2);
                        totalCost = (cost2 - discount) + cost1;
                    }

                    if (totalCost <= K) {
                        int taste = B[i] + B[j];
                        maxTaste = Math.max(maxTaste, taste);
                    }
                }
            }

            System.out.println(maxTaste);
        }

        sc.close();
    }
}
