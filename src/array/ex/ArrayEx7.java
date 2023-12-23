package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};


        for (int row = 0; row < arr.length; row++) {
                System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");
                for (int i = 0; i < 3; i++) {
                    System.out.print(subjects[i] + " 점수:");
                    arr[row][i] = scanner.nextInt();
                }
        }

        for (int row = 0; row < arr.length; row++) {
            int total = 0;
            for (int i = 0; i < 3; i++) {
                total += arr[row][i];
            }
            double avg = (double) total / 3;
            System.out.println((row + 1) + "번 학생의 총점: " + total + ", 평균: " + avg);
        }

    }
}
