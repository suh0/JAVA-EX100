import java.util.Scanner;
public class ex100_0031 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();


        if (a >= 90)
            System.out.print("A\n");
        else if (a >= 70)
            System.out.print("B\n");
        else if (a >= 40)
            System.out.print("C\n");
        else
            System.out.print("D\n");


    }
}