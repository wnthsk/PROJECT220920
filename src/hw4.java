import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.print("랜덤한 정수들 : ");

        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("평균은 ");

        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }

        int avrg = sum / 10;
        System.out.println(avrg);

        sc.close();

    }

}

