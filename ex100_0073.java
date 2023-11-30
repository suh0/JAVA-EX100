import java.util.Scanner;
public class ex100_0073 {

    public static void main(String[] args) {
        int[] arr = new int[10000000];
        int cnt = 1;
        for(int i =1;i<10000000;i = i+2) {
            arr[i] = cnt++;
        }
        cnt = 10;
        for(int i =2;i<10000000;i = i+2) {
            arr[i] = cnt;
            cnt += 10;
        }
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("%d", arr[a] + arr[b]);
    }
}