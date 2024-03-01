package condition.ex;

public class CountScore { // 학점 구하는 프로그램
    public static void main(String[] args) {
        int score = 0;

        if (score >= 90) {
            System.out.println("학점은 A 입니다.");
        } else if (score >= 80 && score < 90) {
            System.out.println("학점은 B 입니다.");
        } else if (score >= 70 && score < 80) {
            System.out.println("학점은 C 입니다.");
        } else if (score >= 60 && score < 70) {
            System.out.println("학점은 D 입니다.");
        } else {
            System.out.println("학점은 F 입니다.");
        }

    }
}
