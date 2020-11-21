package main.java.Task8;

public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        if (direction == Direction.UP) {
            direction = Direction.LEFT;
        } else if (direction == Direction.LEFT) {
            direction = Direction.DOWN;
        } else if (direction == Direction.DOWN) {
            direction = Direction.RIGHT;
        } else {
            direction = Direction.UP;
        }
    }

    public void turnRight() {
        if (direction == Direction.UP) {
            direction = Direction.RIGHT;
        } else if (direction == Direction.LEFT) {
            direction = Direction.UP;
        } else if (direction == Direction.DOWN) {
            direction = Direction.LEFT;
        } else {
            direction = Direction.DOWN;
        }
    }

    public void stepForward() {
        //System.out.println(getX() + " : " + getY());
        //System.out.println(direction);
        if (direction == Direction.UP) {
            y++;
        } else if (direction == Direction.LEFT) {
            x--;
        } else if (direction == Direction.DOWN) {
            y--;
        } else {
            x++;
        }
        //System.out.println(getX() + " : " + getY());
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (toY != robot.getY()) {
            while (robot.getDirection() != (toY < robot.getY() ? Direction.DOWN : Direction.UP)) {
                robot.turnRight();
            }
            while (toY != robot.getY()) {
                robot.stepForward();
            }
        }
        if (toX != robot.getX()) {
            while (robot.getDirection() != (toX < robot.getX() ? Direction.LEFT : Direction.RIGHT)) {
                robot.turnLeft();
            }
            while (toX != robot.getX()) {
                robot.stepForward();
            }
        }
    }
}
