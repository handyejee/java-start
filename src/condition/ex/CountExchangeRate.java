
package condition.ex;

public class CountExchangeRate { // 환율 계산하기 문제
    public static void main(String[] args) {
        int dollar = 4;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            int won = 1300 * dollar; // 환율 변환한 원
            System.out.println("환전 금액은 " + won +  "원입니다.");
        }
    }
}