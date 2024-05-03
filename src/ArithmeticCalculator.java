
import java.util.List;

public class ArithmeticCalculator extends Calculator{

    public ArithmeticCalculator(List<Double> resultList) {
        super(resultList);
    }
    /*InterfaceOperation addOperator = new AddOperator();

    InterfaceOperation subtractOperator = new SubtractOperator();
    InterfaceOperation multiplyOperator = new MultiplyOperator();
    InterfaceOperation divideOperator = new DivideOperator();
    InterfaceOperation modOperator = new ModOperator();*/

    OperatorType op1=OperatorType.PLUS;
    OperatorType op2=OperatorType.MINUS;
    OperatorType op3=OperatorType.MULTIPLICATION;
    OperatorType op4=OperatorType.DIVISION;
    OperatorType op5=OperatorType.REMAIN;


    @Override
    // 사칙연산 계산 메서드
    public double calculate(int num1, int num2, char ch) throws BadInputException {
        double result;
        switch (ch){
            case '+':
                result=op1.operate(num1,num2);
                break;
            case '-':
                result=op2.operate(num1,num2);
                break;
            case '*':
                result=op3.operate(num1,num2);
                break;
            case '/':
                if(num2==0){
                    throw new BadInputException();
                }
                result=op4.operate(num1,num2);
                break;
            case '%':
                result= op5.operate(num1,num2);
                break;
            default:
                throw new BadInputException();   // 잘못된 연산자일 경우 throw
        }
        resultList.add(result);
        return result;
    }

    @Override
    public double calculate(int raduis) {
        return 0;
    }


}
