package loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {
        int num = 1;
        int count = 1;

        while (count <= 10) {
            if (num % 2 == 0){
                count++;
                System.out.println(num);
            }
            num++;
        }

        for (int i = 2, n = 1; n <= 10; i += 2, n++){
            System.out.println(i);
        }
    }
}
