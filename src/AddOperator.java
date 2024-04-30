import java.util.List;

public class AddOperator extends ArithmeticCalculator{

    public AddOperator(List<Integer> resultList) {
        super(resultList);
    }
    public int operate(int num1, int num2){
        return num1+num2;
    }
}
