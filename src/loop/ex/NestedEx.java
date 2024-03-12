package loop.ex;

public class NestedEx {
    public static void main(String[] args) {

        int num = 9;
        for (int i = 2; i <= num; i++) {

            for(int j = 1; j <= num; j++) {
                System.out.println(i + " * " + j + "= " + i*j);
                System.out.println();
            }
        }
    }
}

