package utils;

/**
 * Created by ochernyh on 19.08.2015.
 */
public class ObjectsUtils {
    public static void ifOrElse(Condition condition, VoidAction ifTrue, VoidAction ifFalse) {
        if (condition.condition()) {
            ifTrue.action();
        } else {
            ifFalse.action();
        }
    }

    public static void ifOr(Condition condition, VoidAction ifTrue) {
        if (condition.condition()) {
            ifTrue.action();
        }
    }
}
