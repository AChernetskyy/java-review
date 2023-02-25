package OrangeInventoryTask;
@FunctionalInterface
public interface OrangeFilter <T> {
    String input(T t);
}
