package scanner;

import java.util.Scanner;

// 첫번째 숫자와 두번째 숫자를 더해서 출력하는 프로그램
// 첫번째 숫자와 두번째 숫자 모두 0을 입력하면 프로그램 종료
// 프로그램은 반복해서 실행
public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요. : ");
            int inputNum1 = scanner.nextInt();
            System.out.println("첫 번째 숫자 : " + inputNum1);

            System.out.print("두 번째 숫자를 입력하세요. : ");
            int inputNum2 = scanner.nextInt();
            System.out.println("두 번째 숫자 : " + inputNum2);

            if (inputNum1 == 0 && inputNum2 == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int sum = inputNum1 + inputNum2;
            System.out.println("두 숫자의 합은 " + sum);
        }
    }
}
