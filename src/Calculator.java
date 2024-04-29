import java.util.ArrayList;
import java.util.List;

public class Calculator {
    List<Integer> resultList = new ArrayList<>();

    public void calculate(int num1, int num2, char ch) throws BadInputException {
        int result;
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
                    throw new BadInputException(); // 나눗셈 분모 0일 경우 throw
                }else {
                    result = num1 / num2;
                    break;
                }
            default:
                throw new BadInputException();   // 잘못된 연산자일 경우 throw
        }
        System.out.println("결과 : "+ result);
        resultList.add(result);
        System.out.println(resultList);
    }
}
