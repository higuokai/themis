package themis.framework.util;

/**
 * @author guokai
 * @version 1.0
 */
public class Assert {

    public static void notNull(Object object, String message) {
        if (object == null)
            throw new IllegalArgumentException(message);
    }

    private Assert() {}

}
