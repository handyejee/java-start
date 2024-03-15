package scanner.ex;

import java.util.Scanner;
public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        while (true) {
            int number = sc.nextInt();

            if(number == -1) {
                break;
            }
            sum += input;
            count++; // 평균을 구하기 위해 필요함
        }

        double average = (double) sum / count; // int 형 변수를 double 형으로 변환
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);

    }
}
