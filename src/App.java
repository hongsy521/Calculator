import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            // 계산기 프로젝트
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // 무한반복 조건문
        while (true){
            System.out.print("첫번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요 : ");
            char ch = sc.next().charAt(0);

            // 계산 메서드 호출 - 예외 확인
            try {
                calculator.calculate(num1,num2,ch);
            }catch (BadInputException e){
                System.out.println(e.getMessage());
            }
            // 연산 결과 저장하는 컬렉션 필드 가져오기
            System.out.println("저장된 연산결과를 조회하시겠습니까? (yes 입력 시 조회)");
            String QInquiry = sc.next();
            if(QInquiry.equals("yes") || QInquiry.equals("y")){
                calculator.inquiryResults();
            }

            // 첫번째 연산결과 삭제 - removeResult 메서드 호출
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (yes 입력 시 삭제)");
            String QRemove = sc.next();
            if(QRemove.equals("yes") || QRemove.equals("y")){
                calculator.removeResult();
                System.out.println("삭제되었습니다.");
            }

            // 컬렉션 필드 수정하기
            calculator.setResultList(calculator.getResultList());

            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String QMore=sc.next();
            if(QMore.equals("exit")){
                break;
            }
        }

        }
}
