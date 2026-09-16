import java.util.*;

class Ver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int[] P = new int[N];
            int[] pos = new int[N + 1];

            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
                pos[P[i]] = i;
            }

            // indegree of each value
            int[] indegree = new int[N + 1];

            // Only consecutive values have fixed relative order
            for (int x = 1; x < N; x++) {
                if (pos[x] < pos[x + 1]) {
                    indegree[x + 1]++;
                } else {
                    indegree[x]++;
                }
            }

            boolean[] used = new boolean[N + 1];

            for (int i = 0; i < N; i++) {

                // Find the smallest currently available value
                int smallest = -1;

                for (int x = 1; x <= N; x++) {
                    if (!used[x] && indegree[x] == 0) {
                        smallest = x;
                        break;
                    }
                }

                System.out.print(smallest + " ");

                used[smallest] = true;

                // Remove its outgoing edge
                if (smallest > 1 && !used[smallest - 1]) {
                    if (pos[smallest - 1] > pos[smallest]) {
                        indegree[smallest - 1]--;
                    }
                }

                if (smallest < N && !used[smallest + 1]) {
                    if (pos[smallest + 1] > pos[smallest]) {
                        indegree[smallest + 1]--;
                    }
                }
            }

            System.out.println();
        }

        sc.close();
    }
}