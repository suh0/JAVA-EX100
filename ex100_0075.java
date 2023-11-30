import java.util.Scanner;

public class ex100_0075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;

        for (int i = 1; i <= n ; i++) {
            if(n%i == 0) {
                a = a + 1;
            }
        }
        if (a == 2) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}