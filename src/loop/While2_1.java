package loop;

public class While2_1 { // 1부터 하나씩 증가하는 수를 3번 더해라
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        sum = sum + i; // 0 + 1
        System.out.println("i= " + 1 +  "sum= " + sum);
        i++;

        sum = sum + i; // 1 + 2
        System.out.println("i= " + 2 +  "sum= " + sum);
        i++;

        sum = sum + i; // 3 + 3
        System.out.println("i= " + 3 +  "sum= " + sum);


    }
}
