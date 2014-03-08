package chapter_6;

/**
 * Created by naohiro on 2014/03/08.
 */
public interface IOperation {
    double apply(double x, double y);
}

enum ExtendOperation implements IOperation {
    EXP("^") {
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMAINDER("%") {
        public double apply(double x, double y) {
            return x % y;
        }
    };
    private final String symbol;
    ExtendOperation(String symbol) {
        this.symbol = symbol;
    }
    @Override public String toString() {
        return symbol;
    }
}
