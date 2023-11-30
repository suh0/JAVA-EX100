import java.util.Scanner;
public class ex100_0057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        switch(num1) {
            case 1 : sum += 400; break;
            case 2 : sum += 340; break;
            case 3 : sum += 170; break;
            case 4 : sum += 100; break;
            default : sum += 70;
        }
        switch(num2) {
            case 1 : sum += 400; break;
            case 2 : sum += 340; break;
            case 3 : sum += 170; break;
            case 4 : sum += 100; break;
            default : sum += 70;
        }
        if(sum > 500) System.out.println("angry");
        else System.out.println("no angry");
    }
}