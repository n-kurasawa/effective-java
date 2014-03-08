package chapter_6;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by naohiro on 2014/03/08.
 */
public class Main {
    public static void main(String[] args) {
        // EnumMap
        Herb[] garden = { new Herb("test1", Herb.Type.ANNUAL), new Herb("test2", Herb.Type.PERENNIAL)};

        Map<Herb.Type, Set<Herb>> herbByType =
                new EnumMap<Herb.Type, Set<Herb>>(Herb.Type.class);
        for (Herb.Type t : Herb.Type.values())
            herbByType.put(t, new HashSet<Herb>());
        for (Herb h : garden)
            herbByType.get(h.type).add(h);
        System.out.println(herbByType);

        // 拡張Enum
        double x = 10;
        double y = 4;
        test(ExtendOperation.class, x, y);

    }
    private static <T extends Enum<T> & IOperation> void test(Class<T> onSet, double x, double y) {
        for (IOperation op : onSet.getEnumConstants())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }
}
