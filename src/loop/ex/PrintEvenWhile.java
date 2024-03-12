package loop.ex;

public class PrintEvenWhile {
//    public static void main(String[] args) {
//        int num = 2;
//
//        while (num <= 20) {
//            if(num % 2 == 0) {
//                System.out.println(num);
//            }
//            num++;
//        }
//    }
    public static void main(String[] args) {
        int num = 2;
        int count =  1;

        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }
    }
}