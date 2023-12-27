package method.ex;
public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("평균값: " + avg(a, b ,c));

        int x = 15;
        int y = 25;
        int z = 35;

        System.out.println("평균값: " + avg(x, y, z));
    }

    public static double avg(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
