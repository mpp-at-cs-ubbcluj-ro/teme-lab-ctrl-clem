import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface Repository<ID, T> {
    void add(T elem);
    void update(ID id, T elem);
    Iterable<T> findAll();
}
