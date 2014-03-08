package chapter_5;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by naohiro on 2014/03/08.
 */
public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<Class<?>, Object>();

    public <T> void putFavorite(Class<T> type, T instance) {
        if (type == null)
            throw new NullPointerException();
        favorites.put(type, instance);
    }
    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
