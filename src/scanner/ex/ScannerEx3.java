package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;
        int num = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 :");
        /*
        while (true) {
            int num = input.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            cnt++;
        }
         */
        while ((num = input.nextInt()) != -1) {
            sum += num;
            cnt++;
        }
        double avg = (double) sum / cnt;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
