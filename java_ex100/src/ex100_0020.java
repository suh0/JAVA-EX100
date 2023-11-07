import java.util.Scanner;
public class ex100_0020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a+b+c);   //합
        System.out.printf("%.1f",(float)(a+b+c)/3);   //평균

    }
}
