package utils;

import java.io.IOException;

public class DriverMyExecutor {
    static void setFullPermissionsForDriver(String driverPath) {
        try {
            Runtime.getRuntime().exec("chmod 777 " + driverPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
