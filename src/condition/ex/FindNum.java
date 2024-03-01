package condition.ex;

public class FindNum { //두개의 정수 삼항연산자 사용해 더 큰 숫자 출력하는 문제
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
