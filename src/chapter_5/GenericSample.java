package chapter_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by naohiro on 2014/03/05.
 */
public class GenericSample {
    private static UnaryFunction<Object> IDENTITY_FUNCTION =
            new UnaryFunction<Object>() {
                @Override
                public Object apply(Object arg) {
                    return arg;
                }
            };

    @SuppressWarnings("unchecked")
    public static <T> UnaryFunction<T> identityFunction() {
        return (UnaryFunction<T>)IDENTITY_FUNCTION;
    }

    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};
        UnaryFunction<String> sameString = identityFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1, 2.0, 3L};
        UnaryFunction<Number> sameNumber = identityFunction();
        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }

        Stack<String> stack = new Stack<String>();
        for (String arg : args)
            stack.push(arg);
        while (!stack.isEmpty())
            System.out.println(stack.pop().toUpperCase());

//        List<String> strings = new ArrayList<String>();
//        unsafeAdd(strings, new Integer(14));
//        String s = strings.get(0);
//
////        safeAdd(strings, new Integer(14)); コンパイルエラー
//
//        test();

    }

    public static void unsafeAdd(List list, Object object) {
        list.add(object);
    }

    public static void safeAdd(List<Object> list, Object o) {
        list.add(o);
    }

    static void numElementsCommon(Set s1, Set s2) {
        s1.add("");
        s1.add(null);
    }

    static void numElementsCommon2(Set<?> s1, Set<?> s2) {
//        s1.add(""); コンパイルエラー
        s1.add(null);
    }

    static void test() {
        Object[] objects = new Long[1];
        objects[0] = "I don't fit in ";

//        List<Object> o1 = new ArrayList<Long>();
//        o1.add("I don't fit in ");
    }

    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }
}
