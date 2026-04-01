import java.util.*;

class Solution {
    static boolean can(int[] A, int M, int days) {
        int people = 0;

        for (int a : A) {
            people += a / days;
        }

        return people >= M;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];
        int max = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            max = Math.max(max, A[i]);
        }

        int low = 1, high = max, ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (can(A, M, mid)) {
                ans = mid;
                low = mid + 1; // try more days
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
}