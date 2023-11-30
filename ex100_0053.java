import java.util.Scanner;
public class ex100_0053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double max = 0;
        double add = num1 + num2;
        double min = (num1 - num2 > num2 - num1 ? num1 - num2 : num2 - num1);
        double mul = num1 * num2;
        double div = (num1 / num2 > num2 / num1 ? num1 / num2 : num2 / num1);
        double squt = (Math.pow(num1, num2) > Math.pow(num2, num1) ? Math.pow(num1, num2) : Math.pow(num2, num1));
        if(max < add) max = add;
        if(max < min)  max = min;
        if(max < mul)  max = mul;
        if(max < div) max = div;
        if(max < squt) max = squt;
        System.out.printf("%f", max);
    }
}