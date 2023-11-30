import java.util.Scanner;
public class ex100_0060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int car = 170;
        int tunnel1 = sc.nextInt();
        int tunnel2 = sc.nextInt();
        int tunnel3 = sc.nextInt();

        if(car >= tunnel1) System.out.println("CRASH " + tunnel1);
        else if(car >= tunnel2) System.out.println("CRASH " + tunnel2);
        else if(car >= tunnel3) System.out.println("CRASH " + tunnel3);
        else System.out.println("PASS");
    }
}
