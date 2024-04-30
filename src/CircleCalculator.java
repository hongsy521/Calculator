import java.util.List;

public class CircleCalculator extends Calculator{

    public CircleCalculator(List<Integer> resultList) {
        super(resultList);
    }

    @Override
    public int calculate(int num1, int num2, char ch) throws BadInputException {
        return 0;
    }

    @Override
    // 원의 넓이 메서드 바디 구현
    public int calculateCircle(int raduis){
        int circleArea;
        circleArea=raduis*raduis;
        resultList.add(circleArea);
        return circleArea;
    }

}
