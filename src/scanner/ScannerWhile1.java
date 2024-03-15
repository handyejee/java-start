package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력받는 scanner 객체 생성

        while (true) { // 문자열을 입력하세요 입력창 계속 노출
            System.out.print("문자열을 입력하세요."); // 사용자에게 문자열 입력하도록 안내
            String str = scanner.nextLine(); // 입력창 노출

            if (str.equals("exit")) { // 입력값으로 exit 문자열과 동일한 값이 들어오면 프로그램 종료하고 반복문 중단
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열 " + str); // 사용자가 입력한 문자열 출력
        }
    }
}
