package operator;

public class Operator2 {
    public static void main(String[] args) {

        String result1 = "hello " + "world";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        String result3 = "a + b = " + 10;// 문자열과 정수를 더하면 정수를 문자열로 만들어서 더한다!!
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
