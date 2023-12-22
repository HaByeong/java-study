package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            int num = scanner.nextInt();
            sum += num;

            if (num == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}
