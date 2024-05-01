
import java.util.List;

public class ArithmeticCalculator extends Calculator{

    public ArithmeticCalculator(List<Integer> resultList) {
        super(resultList);
    }
    InterfaceOperation addOperator = new AddOperator();

    InterfaceOperation subtractOperator = new SubtractOperator();
    InterfaceOperation multiplyOperator = new MultiplyOperator();
    InterfaceOperation divideOperator = new DivideOperator();
    InterfaceOperation modOperator = new ModOperator();


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
                if(num2==0){
                    throw new BadInputException();
                }
                result=divideOperator.operate(num1, num2);
                break;
            case '%':
                result= modOperator.operate(num1,num2);
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
