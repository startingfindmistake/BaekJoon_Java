// 1차원 배열
// 바구니 뒤집기
package One_Dimensional_Array;

import java.util.Scanner;
import java.util.Arrays;

public class Fip_the_basket {
    public static void main(String[] args) {
        
        
        //Scanner 객체를 생성하여 사용자 입력을 받습니다.
        Scanner sc = new Scanner(System.in);
        
        //  바구니 총 갯수 N 입력
        int n = sc.nextInt();
        //  M 번 바구니의 순서를 역순으로 입력
        int m = sc.nextInt();


        if(n < 1 || n> 100 || m < 1 || m > 100) {
            sc.close();

            return;
        }

        // 정수 배열을 선언한다.
        int[] basket = new int[n];

        // basket = new int[n];      //처음엔 [0, 0, 0, 0, 0] 상태

        // 배열을 1, 2, 3, ..., N으로 초기화
        for (int i = 0; i< basket.length; i++) {
            basket[i] = i+1;
        }

        // M번 반복하면서 바구니 순서 뒤집기
        for (int k =0; k < m; k++) {
            int i = sc.nextInt();   // 시작 바구니 번호
            int j = sc.nextInt();   // 끝 바구니 번호

                // 입력 받은 i와 j를 0부터 시작하는 인덱스로 변환
            int start = i -1;
            int end = j - 1;

            // start가 end보다 작은 동안 (서로 교차하기 전까지) 반복
            while (start < end) {
                // 1. 두 위치의 값을 교환 (Swap)
                int temp = basket[start];
                basket[start] = basket[end];
                basket[end] = temp;

                // 2. 포인터를 한 칸씩 안쪽으로 이동
                start++;
                end--;
            }
        }

        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }

        sc.close();
        // 입력받은 i와 j를 0부터 시작하느 인덱스로 반환
    }
}
