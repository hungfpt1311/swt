import java.util.logging.Logger;
import java.util.logging.Level;

public class UnreachableCodeExample {
    private static final Logger LOGGER = Logger.getLogger(UnreachableCodeExample.class.getName());
    private static final int NUMBER = 42;

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "The number is: {0}", NUMBER);
    }
}