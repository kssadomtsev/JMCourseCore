package main.java;

public class Task13 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        Throwable throwable = new Throwable();
        final StackTraceElement[] stackTrace = throwable.getStackTrace();
        final String calledMethod = stackTrace[1].getMethodName();
        return calledMethod.equals("main") ? null : stackTrace[2].getClassName() + "#" + stackTrace[2].getMethodName();
    }
}
