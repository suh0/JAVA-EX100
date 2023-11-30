import java.util.Scanner;
public class ex100_0048 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int birthDate = scanner.nextInt();
        int genderInfo = scanner.nextInt();
        int birthYear = getBirthYear(birthDate, genderInfo);
        int currentAge = calculateAge(birthYear);

        System.out.println(currentAge);
    }

    private static int getBirthYear(int birthDate, int genderInfo) {
        int birthYear;
        int century;

        if (genderInfo == 1 || genderInfo == 2) {
            // 1900³â´ë Ãâ»ý
            century = 1900;
        } else {
            // 2000³â´ë Ãâ»ý
            century = 2000;
        }

        birthYear = century + birthDate / 10000;
        return birthYear;
    }

    private static int calculateAge(int birthYear) {
        int currentYear = 2012;
        return currentYear - birthYear + 1;
    }

}