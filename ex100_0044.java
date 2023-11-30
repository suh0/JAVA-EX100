import java.util.Scanner;
public class ex100_0044 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int dayOfWeek = scanner.nextInt();

        if (isWorkDay(dayOfWeek)) {
            System.out.println("oh my god");
        } else {
            System.out.println("enjoy");
        }

    }

    private static boolean isWorkDay(int dayOfWeek) {
        // TODO Auto-generated method stub
        return dayOfWeek >= 1 && dayOfWeek <= 5;
    }

}