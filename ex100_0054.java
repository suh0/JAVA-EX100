import java.util.Scanner;
public class ex100_0054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num2 % num1 == 0) System.out.printf("%d*%d=%d", num1, num2 / num1, num2);
        else if(num1 % num2 == 0) System.out.printf("%d*%d=%d", num2, num1 / num2, num1);
        else System.out.println("none");
    }
}