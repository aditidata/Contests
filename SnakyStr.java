import java.util.*;

class SnakyStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        if (A.charAt(0) == 's' || A.charAt(A.length() - 1) == 's') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}