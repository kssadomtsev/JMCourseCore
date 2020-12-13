package main.java.fInterfacesStreams;

public class Task2 {

    @FunctionalInterface
    interface NumberGenerator<T extends Number>{
        boolean cond(T arg);
    }

    public static NumberGenerator<? super Number> getGenerator() {
        return (NumberGenerator<Number>) arg -> arg.intValue() > 0;
    }

    public static void main(String[] args) {

    }

}
