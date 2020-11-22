package main.java.Task15;

public class Task15Part2 {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean isSuccess = false;
        for (int i = 0; !isSuccess && (i < 3); i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                isSuccess = true;
            } catch (RobotConnectionException robotConnectionException) {
            }
        }
        if (!isSuccess) {
            throw new RobotConnectionException("Failed to establish connection");
        }
    }
}
