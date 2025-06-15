

import java.util.logging.Level;
import java.util.logging.Logger;

public class CatchGenericExceptionExample {

    private static final Logger logger = Logger.getLogger(CatchGenericExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            String s = "OpenAI"; // Không gán null để tránh lỗi vô ích
            int len = s.length(); // An toàn vì không còn null
            if (logger.isLoggable(Level.INFO)) {
                logger.info("Length of string: " + len);
            }
        } catch (NullPointerException e) {
            if (logger.isLoggable(Level.SEVERE)) {
                logger.log(Level.SEVERE, "NullPointerException occurred", e);
            }
        } catch (Exception e) {
            if (logger.isLoggable(Level.SEVERE)) {
                logger.log(Level.SEVERE, "Unexpected exception occurred", e);
            }
        }
    }
}
