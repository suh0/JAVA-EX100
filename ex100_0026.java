import java.util.Scanner;
public class ex100_0026 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean a = scan.nextBoolean();
        if (a)
            System.out.print(!a);
        else
            System.out.print(a);
    }
}