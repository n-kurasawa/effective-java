package chapter_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by naohiro on 2014/03/15.
 */
public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("2");
        list.add("1");
        System.out.println(list.subList(3, 6).indexOf("3"));


        List<String> emptyList = getEmptyList2();
        System.out.println(emptyList);
        getEmptyList2().add("a");
        System.out.println(emptyList);

    }

    private static List<String> getEmptyList() {
        return Collections.emptyList();
    }

    private static final List<String> EMPTY_LIST = new ArrayList<>();
    private static List<String> getEmptyList2() {
        return EMPTY_LIST;
    }
}
