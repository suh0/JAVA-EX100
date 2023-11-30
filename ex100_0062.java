import java.util.Scanner;
public class ex100_0062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        int ban = sc.nextInt();
        int number = sc.nextInt();
        System.out.printf("%d%02d%03d", grade, ban, number);
    }
}