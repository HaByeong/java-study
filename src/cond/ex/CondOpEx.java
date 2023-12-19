package cond.ex;

public class CondOpEx {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int bigNum = (a > b) ? a : b;

        System.out.println("더 큰 숫자는 " + bigNum + "입니다.");
    }
}
