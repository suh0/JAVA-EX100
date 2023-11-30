import java.util.Scanner;
public class ex100_0099 {
    static void calculateGrade(int score) {
        if (score >= 90) {
            System.out.println("AÇÐÁ¡");
        } else if (score >= 80) {
            System.out.println("BÇÐÁ¡");
        } else if (score >= 70) {
            System.out.println("CÇÐÁ¡");
        } else if (score >= 60) {
            System.out.println("DÇÐÁ¡");
        } else {
            System.out.println("EÇÐÁ¡");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputScore = scanner.nextInt();
        calculateGrade(inputScore);
    }

}