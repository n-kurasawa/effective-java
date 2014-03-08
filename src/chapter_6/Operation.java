package chapter_6;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by naohiro on 2014/03/08.
 */
public enum Operation {
    PLUS("+") {
        double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        double apply(double x, double y) { return x / y; }
    };
    private final String symbol;
    Operation(String symbol) { this.symbol = symbol; }
    @Override public String toString() {return symbol; }

    abstract double apply(double x, double y);

    private static final Map<String, Operation> stringToEnum = new HashMap<String, Operation>();
    static {
        for (Operation op : values()) {
            stringToEnum.put(op.toString(), op);
        }
    }
    public static Operation fromString(String symbol) {
        return stringToEnum.get(symbol);
    }
}
