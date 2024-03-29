import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("월(1~12)을 입력하세요:");
        int month = scanner.nextInt(); // 정수로 월 입력

        if(3 <= month && month <= 5) {
            System.out.println("봄입니다");
        }
        else if(6 <= month && month <= 8) {
            System.out.println("여름입니다");
        }
        else if(9 <= month && month <= 11) {
            System.out.println("가을입니다");
        }
        else {
            System.out.println("겨울입니다");
        }
}