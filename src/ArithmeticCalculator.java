import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator extends Calculator{

    public ArithmeticCalculator(List<Integer> resultList) {
        super(resultList);
    }
    ArithmeticCalculator add = new AddOperator(new ArrayList<>());
    ArithmeticCalculator sub = new AddOperator(new ArrayList<>());
    ArithmeticCalculator multi = new AddOperator(new ArrayList<>());
    ArithmeticCalculator div = new AddOperator(new ArrayList<>());

    @Override
    // 사칙연산 계산 메서드
    public int calculate(int num1, int num2, char ch) throws BadInputException {
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
        resultList.add(result);
        return result;
    }

    @Override
    public int calculateCircle(int raduis) {
        return 0;
    }


}
