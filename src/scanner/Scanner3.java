package scanner;

import java.util.Scanner;
public class Scanner3 {
    public static void main(String[] args) { // 정수 2개 입력받고 더 큰 수 출력
        Scanner scanner = new Scanner(System.in); // 입력창 선언

        System.out.print("첫번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.print("두번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("더 큰 숫자: " + num1 );
        } else if (num1 == num2) {
            System.out.println(num1 + "과 " + num2 + "의 값은 동일합니다.");
        } else {
            System.out.println("더 큰 숫자: " + num2 );
        }

    }
}
