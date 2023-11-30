import java.util.Scanner;
public class ex100_0035 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 2; i <= number; i += 2) {
            sum += i;
        }

        // °á°ú Ãâ·Â
        System.out.println(sum);


    }

}