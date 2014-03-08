package chapter_3;

import java.awt.*;

/**
 * Created by naohiro on 2014/02/04.
 */
public class ColorPoint extends Point {
    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    private Color color;

    // 不完全 - 対象性を守っていない
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint))
            return false;
        return super.equals(o) && ((ColorPoint) o).color == color;
    }


}
