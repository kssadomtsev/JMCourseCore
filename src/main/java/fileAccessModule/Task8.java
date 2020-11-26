package main.java.fileAccessModule;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Task8 {

    public static void main(String[] args) {
        Animal animal1 = new Animal("A1");
        Animal animal2 = new Animal("A2");
        byte[] yourBytes = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            objectOutputStream.writeObject(animal1);
            objectOutputStream.writeObject(animal2);
            objectOutputStream.flush();
            yourBytes = byteArrayOutputStream.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(yourBytes));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(yourBytes);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
            Animal animal3 = (Animal) objectInputStream.readObject();
            Animal animal4 = (Animal) objectInputStream.readObject();
            System.out.println(animal3);
            System.out.println(animal4);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

//    public static Animal[] deserializeAnimalArray(byte[] data) {
//        //Твой код здесь
//    }

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
