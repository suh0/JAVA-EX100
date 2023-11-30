import java.util.Scanner;
public class ex100_0028 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a%2 == 0)   //짝수면
            System.out.printf("%d\n", a);
        if (b%2 == 0)   //짝수면
            System.out.printf("%d\n", b);
        if (c%2 == 0)   //짝수면
            System.out.printf("%d\n", c);

    }
}