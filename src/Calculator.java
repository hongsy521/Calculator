import java.util.List;

public class Calculator {
    List<Integer> resultList;
    List<Integer> circleAreaList;

    // 생성자
    public Calculator(List<Integer> resultList, List<Integer> circleAreaList) {
        this.resultList = resultList;
        this.circleAreaList = circleAreaList;
    }

    // 사칙연산 계산 메서드
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
    // 캡슐화를 통해 간접 접근 하도록 함 - getter, setter
    public List<Integer> getResultList() {
        return resultList;
    }
    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }

    public List<Integer> getCircleAreaList() {
        return circleAreaList;
    }

    public void setCircleAreaList(List<Integer> circleAreaList) {
        this.circleAreaList = circleAreaList;
    }


    // 원의 넓이 계산하고 리스트에 넣기
    public int calculateCircleArea(int raduis){
        int circleArea;
        circleArea=raduis*raduis;
        circleAreaList.add(circleArea);
        return circleArea;
    }
    // 연산 결과 조회 메서드 (원의 넓이)
    public void inquiryCircleArea(){
        System.out.println(this.getCircleAreaList());
    }
    // 연산 결과 조회 메서드 (사칙연산)
    public void inquiryResults(){
        System.out.println(this.getResultList());
    }
    // 첫번째 연산 결과 삭제 메서드 (사칙연산)
    public void removeResult(){
        resultList.remove(0);
    }
}
