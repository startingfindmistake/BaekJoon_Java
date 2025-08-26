import java.util.Scanner;

public class AxB {
    public static void main(String[] args) {
        //Scanner 객체를 생성하여 사용자 입력을 받습니다.
        Scanner sc = new Scanner(System.in);

        // 첫 번째 정수 A를 입력받습니다
        int A = sc.nextInt();

        // 두 번째 정수 B를 입력받습니다.
        int B = sc.nextInt();

        // A와 B의 곱을 출력합니다.
        System.out.println(A * B);

        // scanner 객체를 닫아 리소스를 해제합니다.
        sc.close();
    }
}
