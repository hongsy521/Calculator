import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            // 계산기 프로젝트
        Scanner sc = new Scanner(System.in);
        int result=0;
        List<Integer> resultList = new ArrayList<>();

        while (true){
            System.out.print("첫번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요 : ");
            char ch = sc.next().charAt(0);
            switch (ch){
                case '+':
                    result=num1+num2;
                    break;
                case '-':
                    result=num1-num2;
                    break;
                case '*':
                    result=num1*num2;
                    break;
                case '/':
                    if(num2 == 0){
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        continue;
                    }else {
                        result=num1/num2;
                        break;
                    }
                default:
                    System.out.println("잘못된 연산 기호입니다.");
            }

            resultList.add(result);
            System.out.println("결과 : "+ result);
            System.out.println("list : "+ resultList);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String QRemove = sc.next();
            if(QRemove.equals("remove")){
                resultList.remove(0);
            }
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String QMore=sc.next();
            if(QMore.equals("exit")){
                break;
            }
        }

        }
    }