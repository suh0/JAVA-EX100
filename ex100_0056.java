import java.util.Scanner;
public class ex100_0056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[4];
        int count = 0;
        for(int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
            if(inputs[i] == 1) {
                count++;
            }
        }
        switch(count) {
            case 1 : System.out.println("도"); break;
            case 2 : System.out.println("개"); break;
            case 3 : System.out.println("걸"); break;
            case 4 : System.out.println("윷"); break;
            default : System.out.println("모");
        }
    }
}