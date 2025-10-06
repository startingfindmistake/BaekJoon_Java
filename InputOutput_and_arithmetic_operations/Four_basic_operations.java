//index: 입출력과 시칙연산
//subject: 사칙연산

package InputOutput_and_arithmetic_operations;

import java.util.Scanner;

public class Four_basic_operations {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받습니다.
        Scanner sc = new Scanner(System.in);

        // 첫 번째 정수 A를 입력받습니다.
        int A = sc.nextInt();

        // 두 번째 정수 B를 입력받습니다.
        int B = sc.nextInt();

        // println 메서드를 사용하여 연산 결과를 출력하고 다음 줄로 이동합니다.

        // A와 B의 합을 출력합니다.
        System.out.println(A + B);

        // A와 B의 차를 출력합니다.
        System.out.println(A - B);

        // A와 B의 곱을 출력합니다.
        System.out.println(A * B);

        // A를 B로 나눈 몫을 출력합니다.
        System.out.println(A / B);

        // A를 B로 나눈 나머지를 출력합니다.
        System.out.println(A % B);
    }
}
