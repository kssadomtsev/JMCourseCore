package main.java;

public class Task14 {
    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (RuntimeException ignored) {
        }

    }

    private static class Car implements AutoCloseable {
        public void drive() {
            System.out.println("Машина поехала.");
        }

        @Override
        public void close() {
            System.out.println("Машина закрывается...");
        }
    }
}
