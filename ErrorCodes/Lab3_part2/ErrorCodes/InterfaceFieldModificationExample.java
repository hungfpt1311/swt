

import java.util.logging.Logger;

public class InterfaceFieldModificationExample {
    private static final Logger logger = Logger.getLogger(InterfaceFieldModificationExample.class.getName());

    public static void main(String[] args) {
        logger.info("Max users: " + Constants.getMaxUsers());
    }
}

// Đổi tên class constants → theo quy tắc camelCase như IntelliJ yêu cầu
class Constants {
    private static final int MAX_USERS = 100;

    // Ẩn constructor để không cho tạo đối tượng Constants
    private Constants() {}

    // Cung cấp phương thức truy cập
    public static int getMaxUsers() {
        return MAX_USERS;
    }
}
