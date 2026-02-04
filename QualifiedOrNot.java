import java.util.*;
import java.lang.*;
import java.io.*;

public class QualifiedOrNot {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (N >= 2 * X && N >= 2 * Y) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

