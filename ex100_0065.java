import java.util.Scanner;

public class ex100_0065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0 && num <= 10){
            String[] s = new String[num];
            for (int i = 1; i <= num; i++) {
                String x = i+"";
                if(x.equals("3") || x.equals("6") || x.equals("9")){
                    System.out.print("X ");
                }else{
                    System.out.print(i + " ");
                }
            }
        }
    }
}