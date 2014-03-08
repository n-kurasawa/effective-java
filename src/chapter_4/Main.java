package chapter_4;

import java.util.List;

/**
 * Created by naohiro on 2014/03/03.
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> list = SkeletalListSample.intArrayAsList(new int[]{1, 2, 3});

        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}
