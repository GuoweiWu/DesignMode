package AbstarctFactoryMode;

public interface ITest<T> {
    void insert(T object);
    T getObject(String id);
}
