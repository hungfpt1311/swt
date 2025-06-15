import java.util.logging.*;

public class OvercatchingExceptionExample {
    private static final Logger logger = Logger.getLogger(OvercatchingExceptionExample.class.getName());

    static {
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);
    }

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            int index = 10;

            if (logger.isLoggable(Level.INFO)) {
                logger.info(String.format("Attempting to access array element at index %d", index));
            }

            int value = arr[index];

            if (logger.isLoggable(Level.INFO)) {
                logger.info(String.format("Value at index %d: %d", index, value));
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            if (logger.isLoggable(Level.SEVERE)) {
                logger.log(Level.SEVERE, "Array index out of bounds at index 10", e);
            }
        }
    }
}
