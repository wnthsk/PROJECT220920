import java.util.InputMismatchException;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("피연산자 두 수 입력 : ");

            try {
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                System.out.println(n + " x " + m + " = " + n * m);
                break;
            } catch(InputMismatchException e){
                System.out.println("실수는 입력할 수 없습니다.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}

