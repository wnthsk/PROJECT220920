import java.util.Scanner;
//3장 5번
public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.print("양의 정수 10개를 입력하시오 >> ");

        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("3의 배수는 ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0)
                System.out.print(arr[i] + " ");
        }
    }
}

