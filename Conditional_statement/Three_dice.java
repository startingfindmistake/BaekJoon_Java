// 조건문
// 주사위 세개
package Conditional_statement;

import java.util.Scanner;

// 3개의 주사위를 동시에 던진다.
// 1. 같은 눈이 나오면 10000원 + (같은 눈) * 1000원의 상금을 받게 된다.
// 2. 2개의 눈이 같으면 1000원 + (같은 눈) * 100원의 상금을 받게 된다.
// 3. 모두 다른 눈이 나오면 (그 중 가장 큰 눈) * 100원의 상금을 받게 된다.
public class Three_dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 주사위 숫자 입력
        int A = sc.nextInt();
        // 두 번째 숫자 입력
        int B = sc.nextInt();
        // 세번째 숫자 입력
        int C = sc.nextInt();
        // 계산값을 저장할수 있는
        int prize = 0;

        if (A == B && B == C) {
            // 세 눈이 모두 같은 경우 금액 계산
            prize = 10000 + (A * 1000);
        } else if (A == B || A == C || B == C) {
            // 두 눈이 같은 경우 처리할때
            if  (A == B) {
                // a와 b가 같을 때의 상금 계산
                prize = 1000 + (A * 100);
            } else if (A == C) {
                // a와 c가 같을 때의 상금 계산
                prize = 1000 + (C * 100);
            } else {        // b와 C가 같을 수박에 없음
                prize = 1000 + (B * 100);
            }    
        }

        else {
            int max = Math.max(A, Math.max(B, C));
            prize = max * 100;
        }

        System.out.println(prize);
    }
}
