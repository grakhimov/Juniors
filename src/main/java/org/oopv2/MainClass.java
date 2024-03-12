package org.oopv2;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Dog dog = new Dog("DogHead", "DogTorso", List.of("DogPaw1", "DogPaw2", "DogPaw3", "DogPaw4"));
        Cat cat = new Cat("CatHead", "CatTorso", List.of("CatPaw1", "CatPaw2", "CatPaw3", "CatPaw4"));
        dog.voice();
        cat.voice();
        dog.meetMaster();
        cat.meetMaster();
    }
}
