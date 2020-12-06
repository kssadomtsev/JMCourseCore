package main.java.generics;

public class Task4 {
public static class DynamicArray<T> {
    private Object[] elements;

    public DynamicArray() {
        this.elements = new Object[0];
    }

    public void add(T el) {
        Object[] temp = new Object[(elements.length + 1)];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        temp[temp.length - 1] = el;
        elements = temp;
    }

    public void remove(int index) {
        Object[] temp = new Object[(elements.length - 1)];
        System.arraycopy(elements, 0, temp, 0, index);
        System.arraycopy(elements, index + 1, temp, index, elements.length - index - 1);
        elements = temp;
    }

    public T get(int index) {
        return (T) elements[index];
    }

    int length() {
        return elements.length;
    }
}

    public static void main(String[] args) {
        DynamicArray<String> strings = new DynamicArray<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        System.out.println("After add");
        System.out.println("the length is: " + strings.length());
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println();
        strings.remove(2);
        System.out.println("After remove");
        System.out.println("the length is: " + strings.length());
        for (int i = 0; i < strings.length(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
