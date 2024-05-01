import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator extends Calculator{

    public ArithmeticCalculator(List<Integer> resultList) {
        super(resultList);
    }
    AddOperator addOperator= new AddOperator();
    SubtractOperator subtractOperator = new SubtractOperator();
    MultiplyOperator multiplyOperator = new MultiplyOperator();
    DivideOperator divideOperator = new DivideOperator();


    @Override
    // 사칙연산 계산 메서드
    public int calculate(int num1, int num2, char ch) throws BadInputException {
        int result;
        switch (ch){
            case '+':
                result=addOperator.operate(num1,num2);
                break;
            case '-':
                result=subtractOperator.operate(num1,num2);
                break;
            case '*':
                result=multiplyOperator.operate(num1, num2);
                break;
            case '/':
                result=divideOperator.operate(num1, num2);
                break;
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
