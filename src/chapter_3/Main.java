package chapter_3;

import java.awt.*;

/**
 * Created by naohiro on 2014/02/04.
 */
public class Main {

    public static void main(String[] args) {
        cloneSample();
    }

    public static void equalsSample() {
        CaseInsensitiveString caseInsensitiveString = new CaseInsensitiveString("Polish");
        String s = "polish";
        System.out.println(caseInsensitiveString.equals(s));
        System.out.println(s.equals(caseInsensitiveString));

        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        System.out.println(p.equals(cp));
        System.out.println(cp.equals(p));
    }

    public static void cloneSample() {
        CloneSample c = new CloneSample("s", 1);
        CloneSample clone = (CloneSample)c.clone();
        System.out.println(clone.i);
        System.out.println(clone == c);
        System.out.println(clone.str == c.str);

        CloneSample.CloneSample2 cloneSample2 = new CloneSample.CloneSample2(new String[]{"str"});
        CloneSample.CloneSample2 clone2 = cloneSample2.clone();
        System.out.println(clone2.str2 == cloneSample2.str2);
    }
}
