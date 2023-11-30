import java.util.Scanner;
public class ex100_0061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String intStr1 = "";
        String intStr2 = "";
        int idx = 0;
        char op = ' ';
        char[] arr = new char[input.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.charAt(i);
            if (arr[i] == '+' || arr[i] == '/' || arr[i] == '-' || arr[i] == '*') {
                op = arr[i];
                idx = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if ((48 <= arr[i] && arr[i] <= 57) && i < idx) {
                intStr1 += arr[i];
            } else if ((48 <= arr[i] && arr[i] <= 57) && i > idx) {
                intStr2 += arr[i];
            }
        }
        int num1 = Integer.valueOf(intStr1);
        int num2 = Integer.valueOf(intStr2);

        if((num1 == 0 || num2 == 0) && op == '/') {
            return;
        }
        switch(op) {
            case '+' : System.out.println(num1 + num2); break;
            case '-' : System.out.println(num1 - num2);break;
            case '/' : System.out.printf("%.2f", (double)num1 / num2);break;
            case '*' : System.out.println(num1 * num2);break;
        }
    }
}