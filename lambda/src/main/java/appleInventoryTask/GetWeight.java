package appleInventoryTask;

public class GetWeight implements Sort<Apple>{
    @Override
    public boolean test(Apple apple) {
        return (apple.getWeight()>150);
    }
}
