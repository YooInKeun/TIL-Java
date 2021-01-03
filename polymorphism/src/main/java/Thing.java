public interface Thing {
    boolean isLiquid();

    default boolean isThing() {
        return true;
    }
}
