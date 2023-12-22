package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int sum = num1 + num2;

            if (num1 == 0 && num2 == 0) {
                break;
            }

            System.out.println("합은 " + sum);
        }
    }
}
