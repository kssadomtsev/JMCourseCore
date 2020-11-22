package main.java.Task15;

public class Task15 {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean isSuccess = false;
        RobotConnection robotConnection = null;
        for (int i = 0; !isSuccess && (i < 3); i++) {
            try {
                robotConnection = robotConnectionManager.getConnection();
                robotConnection.moveRobotTo(toX, toY);
                isSuccess = true;
            } catch (RobotConnectionException robotConnectionException) {
            } finally {
                if (robotConnection != null) {
                    try {
                        robotConnection.close();
                    } catch (RobotConnectionException ignored) {
                    }
                }
            }
        }
        if (!isSuccess) {
            throw new RobotConnectionException("Failed to establish connection");
        }
    }
}
