package cn.van.kuang.trading.booking.utils;

public final class Guard {

    public static <T> void notNull(T t, String name) {
        if (t == null) {
            throw new IllegalArgumentException(name + " can't be null");
        }
    }

    public static <T> void notEmpty(T t, String name) {
        Guard.notNull(t, name);

        if ("".equals(t)) {
            throw new IllegalArgumentException(name + " can't be empty");
        }
    }

    private Guard() {
        throw new IllegalStateException("Should not invoke this constructor");
    }
}
