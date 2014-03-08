package chapter_3;

/**
 * 不完全 - 対象性を守っていいない
 */
public class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null)
            throw new NullPointerException();
        this.s = s;
    }

    // 不完全 - 対象性を守っていない
    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(
                    ((CaseInsensitiveString)o).s);

        // 以下はなくすべき
        if (o instanceof String) // 一方向の相互作用
            return s.equalsIgnoreCase((String)o);
        return false;
    }

}
