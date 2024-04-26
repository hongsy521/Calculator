import java.util.Scanner;

public class App {
    public static void main(String[] args) {
            // 계산기 프로젝트
        Scanner sc = new Scanner(System.in);
        int result=0;
        int[] resultArr=new int[10];  // 연산결과 저장할 배열 선언 - 크기 10
        int count=0;

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
            // System.out.println(count);
            resultArr[count]=result;   // 결과값 배열에 저장
            count+=1;                  // count 세기

            System.out.println("결과 : "+result);
            System.out.println("더 계산하시겠습니까? (exit 입력시 종료)");
            String input=sc.next();
            if(input.equals("exit")){
                break;
            }
        }

        }
    }