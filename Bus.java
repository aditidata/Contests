import java.util.*;

class Bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            if (K <= N) {
                System.out.println(0);
            } else {
                System.out.println(2 * (K - N));
            }
        }

        sc.close();
    }
}