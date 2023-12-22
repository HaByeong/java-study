package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2) {
            int exNum = num1;
            num1 = num2;
            num2 = exNum;
        }

        System.out.print("두 숫자 사이의 모든 정수");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(",");
            }
        }

    }
}
