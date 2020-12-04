package main.java.fileAccessModule;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Task8 {

    public static void main(String[] args) {
        Animal[] animals = {new Animal("A1"), new Animal("A2"), new Animal("A3")};
        byte[] yourBytes = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            objectOutputStream.writeInt(animals.length);
            for (Animal animal : animals) {
                objectOutputStream.writeObject(animal);
            }
            yourBytes = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Animal[] animalsOut = deserializeAnimalArray(yourBytes);
        System.out.println(Arrays.toString(animalsOut));
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        if (data == null) {
            throw new IllegalArgumentException();
        }
        Animal[] animals = null;
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data); ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
            int size = objectInputStream.readInt();
            animals = new Animal[size];
            for (int i = 0; i < size; i++) {
                animals[i] = (Animal) objectInputStream.readObject();

            }
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        return animals;
    }

    static class Animal implements Serializable {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
