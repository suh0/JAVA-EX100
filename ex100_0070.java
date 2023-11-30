import java.util.Scanner;

public class ex100_0070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long r = scanner.nextLong();
        long n = scanner.nextLong();

        long result = a;

        for (int i = 1; i < n; i++) {
            result *= r;
        }

        System.out.println(result);

    }
}
