package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //m 생존 시작
        if (true) {
            int x = 20; //x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }//여기까지 x 생존 종료
    }//여기까지 m 생존 종료
}
