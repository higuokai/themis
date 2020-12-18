package themis.framework.util;

import java.util.Collection;

/**
 * @author guokai
 * @version 1.0
 */
public class CollectionUtils {

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isEmpty(Object source) {
        return source == null || (source instanceof Collection && (((Collection<?>) source).isEmpty()));
    }

}
