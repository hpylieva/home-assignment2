package task3;

public interface Config {
    <T> Class<T> getImpl(Class<T> ifc);
}
