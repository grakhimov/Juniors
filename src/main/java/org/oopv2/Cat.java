package org.oopv2;

import java.util.List;

public class Cat extends Animal implements AnimalBehavior {
    public Cat(Object head, Object torso, List<Object> paws) {
        super(head, torso, paws);
    }

    @Override
    public void voice() {
        System.out.println("Mew!");
    }

    @Override
    public void meetMaster() {
        System.out.println("Do nothing");
    }
}
