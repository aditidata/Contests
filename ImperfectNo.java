import java.util.*;

class ImperfectNo {

    
    static boolean isImperfect(int n) {
        boolean div2 = (n % 2 == 0);
        boolean div5 = (n % 5 == 0);

        return (div2 || div5) && !(div2 && div5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            
            if (isImperfect(N)) {
                System.out.println(0);
                continue;
            }

            int diff = 1;

            while (true) {
                
                if (N - diff > 0 && isImperfect(N - diff)) {
                    System.out.println(diff);
                    break;
                }

                
                if (isImperfect(N + diff)) {
                    System.out.println(diff);
                    break;
                }

                diff++;
            }
        }

        sc.close();
    }
}
