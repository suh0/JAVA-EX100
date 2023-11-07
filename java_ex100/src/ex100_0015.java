import java.util.Scanner;
public class ex100_0015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //년
        int b = scan.nextInt(); //월
        int c = scan.nextInt(); //일

        System.out.printf("%04d.%02d.%02d", a, b, c);
    }
}
