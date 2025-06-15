import java.util.Scanner;
import java.util.logging.Logger;

public class HardcodedCredentialsExample {

    private static final Logger logger = Logger.getLogger(HardcodedCredentialsExample.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Enter username: ");
        String username = scanner.nextLine();

        logger.info("Enter password: ");
        String password = scanner.nextLine();

        if (authenticate(username, password)) {
            logger.info("Access granted");
        } else {
            logger.warning("Access denied");
        }

        scanner.close();
    }

    private static boolean authenticate(String user, String pass) {
        // Giả sử giá trị hợp lệ được lấy từ biến môi trường (thay cho hardcoded)
        String validUser = System.getenv("APP_USERNAME");
        String validPass = System.getenv("APP_PASSWORD");

        // Nếu biến môi trường chưa được thiết lập, cảnh báo
        if (validUser == null || validPass == null) {
            logger.severe("Missing environment variables: APP_USERNAME or APP_PASSWORD");
            return false;
        }

        return user.equals(validUser) && pass.equals(validPass);
    }
}
