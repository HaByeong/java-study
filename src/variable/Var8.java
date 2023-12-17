package variable;

public class Var8 {

    public static void main(String[] args) {
        //정수
        byte b = 127;//1바이트, -128 ~ 127 -> 2의 8승
        short s = 32767; //2바이트, -32.768 ~ 32.767 -> 2의 16승
        int i = 2147483647; //4바이트, 거진 20억.. -> 2dml 32승

        long l = 9223372036854775807L; //8바이트, 꼭 뒤에 L을 넣어줘야함 -> 2의 64승

        //실수
        float f = 10.0f;//f를 붙여줘야함 -> 4바이트
        double d = 10.0;//8바이트
    }
}
