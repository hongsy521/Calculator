import java.util.ArrayList;
import java.util.List;

public class Calculator {
    List<Integer> resultList = new ArrayList<>();
    // 캡슐화를 통해 간접 접근 하도록 함
    public List<Integer> getResultList() {
        return resultList;
    }

    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }

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
    }
    // 첫번째 연산 결과 삭제 메서드
    public void removeResult(){
        resultList.remove(0);
    }
    // 연산 결과 조회 메서드
    public void inquiryResults(){
        System.out.println(resultList.toString());
    }
}
