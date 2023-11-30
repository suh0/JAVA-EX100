import java.util.*;

public class ex100_0098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 흰돌의 개수
        scanner.nextLine();

        int[][] board = new int[10][10]; // 바둑판 생성

        // 흰돌 좌표 입력 받아서 바둑판에 표시
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt(); // X 좌표
            int y = scanner.nextInt(); // Y 좌표
            scanner.nextLine();

            board[x - 1][y - 1] = 1; // 흰돌 표시
        }

        // 바둑판 출력
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}