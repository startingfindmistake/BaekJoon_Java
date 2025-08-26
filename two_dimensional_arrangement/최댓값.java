package two_dimensional_arrangement;

import java.util.Scanner;

public class 최댓값 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 9x9 크기의 정수형 2차원 배열을 선언합니다.
        int[][] grid = new int[9][9];

        for (int i =0; i < 9; i++) {            // i는 행 번호를 의미
            for (int j =0; j < 9; j++) {        // j는 열 번홀르 의미
                grid[i][j] = sc.nextInt();     // i행 j열에 입력값 저장
            }
        }
        sc.close();

        int max = 0;
        int row = 1;
        int col = 1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];       //최댓값 업데이트
                    row = i + 1;            // 위치(행) 업데이트 (+1 해주기!)
                    col = j + 1;            // 위치(열) 업데이트 (+1 해주기!)
                }
            }
        }


        // 결과 출력하기
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}
