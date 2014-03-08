package chapter_4;

import java.util.AbstractList;
import java.util.List;

/**
 * Created by naohiro on 2014/03/03.
 */
public class SkeletalListSample {

    static List<Integer> intArrayAsList(final int[] a) {
        if (a == null)
            throw new NullPointerException();

        return new AbstractList<Integer>() {
            @Override
            public Integer get(int i) {
                return a[i];
            }

            @Override
            public Integer set(int i, Integer val) {
                int oldval = a[i];
                a[i] = val;
                return oldval;
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }
}

