package chapter_5;

import java.util.*;

/**
 * Created by naohiro on 2014/03/08.
 */
public class Main {

    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<Number>();
        Iterable<Integer> integers = new ArrayList<Integer>();
        numberStack.pushAll(integers);

        Collection<Object> objects = new ArrayList<Object>();
        numberStack.popAll(objects);

        Set<Integer> i = new HashSet<Integer>();
        Set<Double> d = new HashSet<Double>();
        Set<Number> n = Main.<Number>union(i, d);
    }

    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
        return null;
    }

    public static <T extends Comparable<? super T>> T max(List<? extends T> list) {
        Iterator<? extends T> i = list.iterator();
        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0) {
                result = t;
            }
        }
        return result;
    }

    public static void swap(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }
    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.get(j));
    }

}
