package chapter_3;

/**
 * Created by naohiro on 2014/03/01.
 */
public class CloneSample implements Cloneable{
    public String str;
    public int i;

    public CloneSample(String str, int i) {
        this.str = str;
        this.i = i;
    }

    @Override
    public CloneSample clone() {
        try {
            return (CloneSample)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class CloneSample2 implements  Cloneable {
        public String[] str2;

        public CloneSample2(String[] str) {
            this.str2 = str;
        }

        @Override
        public CloneSample2 clone() {
            try {
                CloneSample2 clone = (CloneSample2) super.clone();
                clone.str2 = str2.clone();
                return clone;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}
