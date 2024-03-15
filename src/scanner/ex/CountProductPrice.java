package scanner.ex;

import java.util.Scanner;

// 사용자로부터 상품의 가격과 수량을 입력받고, 총 비용을 출력하는 프로그램
public class CountProductPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
            int price = input.nextInt();

            if (price == -1){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요: ");
            int quantity = input.nextInt();
//            input.nextLine();

            int total = price * quantity;
            System.out.println("총 비용 : " + total);
        }
    }
}