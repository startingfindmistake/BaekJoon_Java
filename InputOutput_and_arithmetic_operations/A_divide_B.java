// 소수점을 주의해 주세요
import java.util.Scanner;

public class A_divide_B {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받습니다.
        Scanner sc = new Scanner(System.in);

        // 첫 번째 정수 A를 입력받습니다.
        double A = sc.nextInt();

        // 두 번째 정수 B를 입력받습니다.
        double B = sc.nextInt();

        // A를 B로 나눈 몫을 구합니다.
        System.out.println(A / B);

        // Scanner 객체를 닫아 리소스를 해제합니다.
        sc.close();
    }
}