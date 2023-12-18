package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        //리터럴 비교
        boolean result1 = "hello".equals("hello");
        //문자열 변수, 리터럴 비교
        boolean result2 = str1.equals("문자열1");
        //문자열 변수 비교
        boolean result3 = str1.equals(str2);

        //커맨드 + 쉬프트 + 엔터 => ; 자동으로 완성
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
