package loop.ex;

public class PrintSumFor {
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;

        for (int i = 0; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}
