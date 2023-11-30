import java.util.Scanner;
public class ex100_0058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        if(max == a) a = 0;
        else if(max == b) b = 0;
        else if(max == c) c = 0;
        if(max < (a + b + c)) System.out.println("yes");
        else System.out.println("no");
    }
}