package appleInventoryTask;

@FunctionalInterface
public interface Sort <T> {
    boolean test(T t);

}
