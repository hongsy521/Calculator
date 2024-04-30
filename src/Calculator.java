import java.util.List;

public abstract class Calculator {
    List<Integer> resultList;

    public Calculator(List<Integer> resultList) {
        this.resultList = resultList;
    }

    // 캡슐화를 통해 간접 접근 하도록 함 - getter, setter
    public List<Integer> getResultList() {
        return resultList;
    }

    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }

    // 사칙연산 계산 메서드
    public abstract int calculate(int num1, int num2, char ch) throws BadInputException;


    // 원의 넓이 계산 메서드
    public abstract int calculateCircle(int raduis);

    public void inquiryResult() {
        System.out.println(this.getResultList());
    }
    public void removeResult(){
        resultList.remove(0);
        System.out.println("첫번째 인덱스의 연산결과가 삭제되었습니다.");
    }

}
