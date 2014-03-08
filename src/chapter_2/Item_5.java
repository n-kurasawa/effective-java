package chapter_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 不要なオブジェクトを生成しない
 * Map#keySet は同じインスタンスを返す
 */
public class Item_5 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a","a");
        map.put("b","b");
        map.put("c","c");

        Set<String> strings1 = map.keySet();
        Set<String> strings2 = map.keySet();

        System.out.println(strings1 == strings2);
    }
}
