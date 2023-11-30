import java.util.Scanner;
public class ex100_0047 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        // 윤년 여부 판단
        if (isLeapYear(year)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }

    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // 윤년
        } else {
            return false; // 윤년 아님
        }
    }

}