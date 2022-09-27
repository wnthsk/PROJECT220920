import java.util.Scanner;

//3장 3번
public class HW2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("정수를 입력하시오 >> ");
        int num = scanner.nextInt();
        for(int i = 0; i < num; i++){
            for(int j=0; j < num-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
