package concepts.higherorder;

public interface IConfigurator<T,R> {

    R configure(T t);
}
