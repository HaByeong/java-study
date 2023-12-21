package casting;

public class Casting3 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1(초괴) 즉 넘어버림 (오류) -> 사용하려면 long 값 L 넣어줘야함 그냥 리터럴은 인트임
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환 -> 아무 문제 없음 int는 원래 2147483647까지 표현하니까
        System.out.println("maxIntValue casting= " + intValue);

        intValue = (int) maxIntOver; // 형변환(초과)
        System.out.println("maxIntOver casting=" + intValue); // 오버플로우 발생: -2147483648 가장 작은 수에서 부터 남은 수 다시 시작(시계처럼 생각해!!)
    }
}
