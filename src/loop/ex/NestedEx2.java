package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {
        int rows = 5;

        for(int i = 1; i <= 5; i++){
            for(int a = 1; a <= i; a++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}