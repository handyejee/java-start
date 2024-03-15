package scanner.ex;

import java.util.Scanner;

// 사용자로부터 두개의 정수를 입력받고, 두 정수 사이의 모든 정수 출력하는 프로그램


public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = input.nextInt();

        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = input.nextInt();

        if(num1 > num2) {
            temp = num1;
            // System.out.println("temp" + temp);
            num1 = num2;
            // System.out.println("num1" + num1);
            num2 = temp;
            // System.out.println("temp" + temp);
        }

        System.out.print("두 숫자 사이의 모든 정수: ");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.println(", "); // 마지막 숫자가 아닐때만 i 뒤에 , 붙이기
            }
        }
    }
}
