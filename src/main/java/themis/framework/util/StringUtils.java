package themis.framework.util;

import themis.framework.constant.StringConstant;

/**
 * @author guokai
 * @version 1.0
 */
public class StringUtils {

    public static boolean isEmpty(Object source) {
        return source == null || StringConstant.EMPTY.equals(source);
    }

    public static boolean isNotEmpty(Object source) {
        return !isEmpty(source);
    }

    private StringUtils() {}

}
