import java.util.List;

public class MultiplyOperator extends ArithmeticCalculator{

    public MultiplyOperator(List<Integer> resultList) {
        super(resultList);
    }
    public int operate(int num1, int num2){
        return num1*num2;
    }
}
