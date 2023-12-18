package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a;
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;
        b = a++;//대입 이후 a 값 증가 시킨다
        System.out.println("a = " + a + ", b = " + b);
    }
}
