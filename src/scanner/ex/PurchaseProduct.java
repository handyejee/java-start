package scanner.ex;

import java.util.Scanner;
// 사용자로부터 상품정보(상품명, 가격, 수량)을 입력받고, 이들의 총 가격을 출력하는 프로그램

public class PurchaseProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int productPrice = 0;
        int productQuantity = 0;
        int total = 0;

        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();

            if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String productName = input.nextLine();
                input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                productPrice = input.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                productQuantity = input.nextInt();

                System.out.println("상품명:" + productName + " 가격:" + productPrice + " 수량:" + productQuantity);
                
            } else if (option == 2) {
                 total += productPrice * productQuantity; // 판매개수 누적하기 위해 += 연산 사용
                System.out.println("총비용: " + total);
                total = 0; // 결제 후 총 비용 초기화

            }else if (option == 3){
                System.out.println("프로그램을 종료합니다.");
                break;

            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
