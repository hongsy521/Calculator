import java.util.List;

public class CircleCalculator extends Calculator{
    final static double PI = 3.14;

    public CircleCalculator(List<Double> resultList) {
        super(resultList);
    }

    @Override
    public double calculate(int num1, int num2, char ch) {
        return 0;
    }

    @Override
    // 원의 넓이 메서드 바디 구현
    public double calculate(int raduis){
        double circleArea;
        circleArea=(double) raduis*raduis*PI;
        resultList.add(circleArea);
        return circleArea;
    }

}
