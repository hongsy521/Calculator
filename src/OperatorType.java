import java.util.function.DoubleBinaryOperator;

public enum OperatorType {
    PLUS("+",(x,y)->x+y),
    MINUS("-",(x,y)->x-y),
    MULTIPLICATION("*",(x,y)->x*y),
    DIVISION("/",(x,y)->x/y),
    REMAIN("%",(x,y)->x%y);

    private final DoubleBinaryOperator op;  // 람다식 저장 필드
    private final String type;

    OperatorType(String  type, DoubleBinaryOperator op) {
        this.type = type;
        this.op=op;
    }

    public String getType() {
        return type;
    }

    public double operate(double x, double y){
        return op.applyAsDouble(x,y);
    };
}
