package loop.ex;

public class NestedEx1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int a = 1; a <= 9; a++){
                System.out.println(i + " * " + a + " = " + i * a);
            }
        }
    }
}