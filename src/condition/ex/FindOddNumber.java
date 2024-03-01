package condition.ex;

public class FindOddNumber {
    public static void main(String[] args) {
        int x = 3;

        String odd = (x % 2 == 0) ? "짝수 " : "홀수";
        System.out.println("x = " + x + ", " + odd);

    }
}
