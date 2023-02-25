package AppleInventoryTask;

public class GetColor implements Sort<Apple>{
    @Override
    public boolean test(Apple apple) {
        return (apple.getColor()==Color.GREEN);
    }
}
