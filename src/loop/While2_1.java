package loop;

public class While2_1 {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        while (count < 3){
            count += 1;
            sum += count;
            System.out.println("i=" + count + " sum=" + sum);
        }

    }
}
