import java.util.*;

public class Accomodation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            long B = sc.nextLong();
            long G = sc.nextLong();
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long N = sc.nextLong();

            // Step 1: Minimum per room check
            if (X + Y > N) {
                System.out.println(-1);
                continue;
            }

            // Step 2: Minimum rooms required
            long roomsForBoys = (B + X - 1) / X; // ceil(B/X)
            long roomsForGirls = (G + Y - 1) / Y; // ceil(G/Y)

            long rooms = Math.max(roomsForBoys, roomsForGirls);

            // Step 3: Total capacity check
            if (rooms * N < B + G) {
                System.out.println(-1);
            } else {
                System.out.println(rooms);
            }
        }
    }
}

    

