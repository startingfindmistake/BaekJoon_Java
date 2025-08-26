package two_dimensional_arrangement;

import java.util.Scanner;

public class 행렬_덧셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // N과 M 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 2차원 배열을 선언합니다.
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        // 행렬 A의 값 저장하기
        for(int i = 0; i< N; i++) {     // i는 행(row)을 의미
            for (int j = 0; j < M; j++) { // j는 열(column)을 의미
                A[i][j] = sc.nextInt();
            }
        }

        // 행렬 B의 값 저장하기
        for(int i =0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                //A[i][j] 와 B[i][j]를 더한 결과를 출력
                System.out.print((A[i][j] + B[i][j]) + " ");    // 각 원소 뒤에서 공백 추가
            }
            System.out.println();       // 한 줄(행) 출력이 끝나면 줄바꿈
        }
    }
}

