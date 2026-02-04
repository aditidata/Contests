import java.util.*;

class StringLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();

            int[] freq = new int[26];

            // Step 1: convert to lowercase & count
            for (int i = 0; i < N; i++) {
                char c = Character.toLowerCase(S.charAt(i));
                freq[c - 'a']++;
            }

            // Step 2: find largest and second largest frequencies
            int max1 = 0, max2 = 0;
            for (int f : freq) {
                if (f > max1) {
                    max2 = max1;
                    max1 = f;
                } else if (f > max2) {
                    max2 = f;
                }
            }

            // Step 3: best possible score
            System.out.println(max1 + max2);
        }
    }
}

    
