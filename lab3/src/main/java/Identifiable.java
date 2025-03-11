import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public interface Identifiable<ID> {
    void setId(ID id);
    ID getId();
}
