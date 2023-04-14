package com.gmail.sge.serejka;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5, 7, "Black");
        Serializator serializator = new Serializator();
        File file = new File("a.txt");
        System.out.println("Object to save: " + cat);
        serializator.serialize(cat, file);
        Cat catLoad = (Cat) serializator.deserialize(file);
        System.out.println("Loaded object: " + catLoad);
    }
}
