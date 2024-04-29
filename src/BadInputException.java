public class BadInputException extends Exception{
    public BadInputException() {
        System.out.println("잘못된 연산자 또는 나눗셈의 분모가 0 입니다.");
    }
}
