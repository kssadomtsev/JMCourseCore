package main.java.Task8;

public class Task8 {

    public static void main(String[] args) {
        Robot robot = new Robot(3,3, Direction.LEFT);
        System.out.println(robot.getX() + " : " + robot.getY());
        Robot.moveRobot(robot,5,5);
        System.out.println(robot.getX() + " : " + robot.getY());

    }
}
