import java.util.List;

public class DivideOperator{

    public static int operate(int num1, int num2) throws BadInputException{
        if(num2 == 0){
            throw new BadInputException(); // 나눗셈 분모 0일 경우 throw
        }else {
            return num1/num2;
        }
    }
}
